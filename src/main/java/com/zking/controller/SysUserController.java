package com.zking.controller;

import com.zking.model.SysUser;
import com.zking.service.ISysUserService;
import com.zking.shiro.PasswordHelper;
import com.zking.util.PageBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.io.IOException;


@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    private static String Url = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";


    private static String duanxin;

    /**
     * 登录
     * @param sysUser
     * @param model
     * @return
     */
    @RequestMapping(value = "/userlogin")
    @ResponseBody
    public Map<String,Object> userLogin(SysUser sysUser, Model model,HttpServletRequest request){

        Map<String,Object> map = new HashMap<>();
        System.out.println("duanxin:"+duanxin);
        String yzm = request.getParameter("yzm");
        System.out.println("yzm:"+yzm);
            //拿到shiro的主体对象
            Subject subject = SecurityUtils.getSubject();
            //将前端传梯过来的用户账号和密码封装到立牌中准备验证
            UsernamePasswordToken token = new UsernamePasswordToken(
                    sysUser.getUsername(),
                    sysUser.getPassword()
            );
            String msg = null;
            try {
                subject.login(token);
            } catch (AccountException e) {
                msg = "账号错误";
            }catch (IncorrectCredentialsException e){
                msg = "密码错误";
            }catch (Exception e){
                msg = "该用户已经被禁用无法进行登录";
            }
            if(null == msg){
                if(duanxin.equals(yzm)){
                    if(sysUser!=null){
                        map.put("msg",sysUser);
                    }
                return map;
                }else{
                    map.put("msg","验证码不一致");
                    return map;
                }
            }else{
                map.put("msg",msg);
                return map;
            }
//        //拿到shiro的主体对象
//        Subject subject = SecurityUtils.getSubject();
//        //将前端传梯过来的用户账号和密码封装到立牌中准备验证
//        UsernamePasswordToken token = new UsernamePasswordToken(
//                sysUser.getUsername(),
//                sysUser.getPassword()
//        );
//        String msg = null;
//        try {
//            subject.login(token);
//        } catch (AccountException e) {
//            msg = "账号错误";
//        }catch (IncorrectCredentialsException e){
//            msg = "密码错误";
//        }catch (Exception e){
//            msg = "登陆失败";
//        }
//        if(null == msg){
//            if(sysUser!=null){
//                map.put("msg",sysUser);
//            }
//            return map;
//        }else{
//            map.put("msg",msg);
//            return map;
//        }
    }

    /**
     * 注册
     * @param mode
     * @param sysUser
     * @return
     */
    @RequestMapping("RegUser")
    @ResponseBody
    public Map<String,Object> RegUser(Model mode,SysUser sysUser){

        Map<String,Object> map = new HashMap<>();
        sysUser.setSalt(PasswordHelper.createSalt());
        sysUser.setPassword(PasswordHelper.createCredentials(sysUser.getPassword(),sysUser.getSalt()));
        int i = sysUserService.RegUser(sysUser);
        if(i>0){
            map.put("msg",1);
        }else{
            map.put("msg",0);
        }
        return map;
    }

    /**
     * 查询用户所有信息
     * @param sysUser
     * @param model
     * @return
     */
    @RequestMapping("listsysUserAll")
    @ResponseBody
    public Map<String,Object> listsysUserAll(SysUser sysUser, Model model, PageBean pageBean,HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        pageBean.setRows(5);
        pageBean.setRequest(request);
        List<SysUser> sysUsers = sysUserService.listsysUserAll(sysUser,pageBean);
        if(sysUsers!=null){
            map.put("rows",sysUsers);
        }
        map.put("total",pageBean.getTotal());
        return map;
    }

    /**
     * 用户状态启用
     * @param model
     * @param sysUser
     * @return
     */
    @RequestMapping("userStart")
    @ResponseBody
    public Map<String,Object> userStart(Model model ,SysUser sysUser){
        Map<String,Object> map = new HashMap<>();
        int i = sysUserService.userStart(sysUser);
        if(i>0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }

    /**
     * 用户状态禁用
     * @param model
     * @param sysUser
     * @return
     */
    @RequestMapping("userStop")
    @ResponseBody
    public Map<String,Object> userStop(Model model ,SysUser sysUser){
        Map<String,Object> map = new HashMap<>();
        int i = sysUserService.userStop(sysUser);
        if(i>0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }


    /**
     * 根据usreid查询用户信息
     * @param model
     * @param sysUser
     * @return
     */
    @RequestMapping("loadSysUserByid")
    @ResponseBody
    public Map<String,Object> loadSysUserByid(Model model ,SysUser sysUser){
        Map<String,Object> map = new HashMap<>();
        SysUser user = sysUserService.loadSysUserByid(sysUser);
        if(user!=null){
            map.put("msg",user);
        }else{
            map.put("msg","no");
        }
        return map;
    }



    /**
     * 根据findeuserbyid查询出用户个人信息
     * @param model
     * @param sysUser
     * @return
     */
    @RequestMapping("findUserByid")
    @ResponseBody
    public Map<String,Object> findUserByid(Model model,SysUser sysUser){
        Map<String,Object> map = new HashMap<>();
        SysUser userByid = sysUserService.findUserByid(sysUser);
        if(userByid!=null){
            map.put("msg",userByid);
        }else{
            map.put("msg","no");
        }
        return map;
    }

    /**
     * 根据username查询出用户和学生信息
     * @param model
     * @param sysUser
     * @return
     */
    @RequestMapping("findByUserandStudent")
    @ResponseBody
    public Map<String,Object> findByUserandStudent(Model model,SysUser sysUser){
        Map<String,Object> map = new HashMap<>();
        SysUser byUserandStudent = sysUserService.findByUserandStudent(sysUser);
        if(byUserandStudent!=null){
            map.put("msg",byUserandStudent);
        }else{
            map.put("msg","no");
        }
        return map;
    }



    @RequestMapping("Duanxin")
    @ResponseBody
    public static String Duanxin(HttpServletRequest request){
        HttpClient client = new HttpClient();
        PostMethod method = new PostMethod(Url);

        client.getParams().setContentCharset("GBK");
        method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=GBK");

        int mobile_code = (int)((Math.random()*9+1)*100000);

        String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");

        String phone = request.getParameter("phone");
//C14481325
//c6fd1f4bc77f90993aff99740fc351ed
        NameValuePair[] data = {//提交短信
                new NameValuePair("account", "C17211348"), //查看用户名是登录用户中心->验证码短信->产品总览->APIID
                new NameValuePair("password", "860d58200b6846a6d45f15ac74d05642"),  //查看密码请登录用户中心->验证码短信->产品总览->APIKEY
                //new NameValuePair("password", util.StringUtil.MD5Encode("密码")),
                new NameValuePair("mobile", phone),
                new NameValuePair("content", content),
        };
        method.setRequestBody(data);
        duanxin = content.substring(7, 13);
        try {
            client.executeMethod(method);

            String SubmitResult =method.getResponseBodyAsString();

            //System.out.println(SubmitResult);

            Document doc = DocumentHelper.parseText(SubmitResult);
            Element root = doc.getRootElement();

            String code = root.elementText("code");
            String msg = root.elementText("msg");
            String smsid = root.elementText("smsid");

            System.out.println(code);
            System.out.println(msg);
            System.out.println(smsid);
            System.out.println(content);
            if("2".equals(code)){
                System.out.println("短信提交成功");
            }

        } catch (HttpException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return duanxin;
    }

    /**
     * 根据用户名拿到员工id
     * @param model
     * @param sysUser
     * @return
     */
    @RequestMapping("findBystId")
    @ResponseBody
    public Map<String,Object> findBystId(Model model,SysUser sysUser){
        Map<String,Object> map = new HashMap<>();
        SysUser bystId = sysUserService.findBystId(sysUser);
        if(bystId!=null){
            map.put("rows",bystId);
        }
        return map;
    }
}
