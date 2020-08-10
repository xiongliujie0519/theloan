package com.zking.controller;

import com.zking.model.SysUser;
import com.zking.service.ISysUserService;
import com.zking.shiro.PasswordHelper;
import com.zking.util.PageBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;


    /**
     * 登录
     * @param sysUser
     * @param model
     * @return
     */
    @RequestMapping(value = "/userlogin",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> userLogin(SysUser sysUser, Model model){
        Map<String,Object> map = new HashMap<>();

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
            map.put("msg",1);
            return map;
        }else{
            map.put("msg",msg);
            return map;
        }
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
}
