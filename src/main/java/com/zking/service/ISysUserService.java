package com.zking.service;

import com.zking.model.SysUser;
import com.zking.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Transactional
public interface ISysUserService {
    int deleteByPrimaryKey(Integer userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    //登录
    @Transactional(readOnly = true)
    SysUser userLogin(String username);

    /**
     * 获取用户的角色名
     * @param username
     * @return
     */
    Set<String> findRole(@Param("username") String username);

    /**
     * 获取角色的权限信息
     * @param username
     * @return
     */
    Set<String> findPermission(@Param("username") String username);


    /**
     * 用户注册
     * @param sysUser
     * @return
     */
    int RegUser(SysUser sysUser);


    /**
     * 查询所有用户信息
     * @param sysUser
     * @return
     */
    @Transactional(readOnly = true)
    List<SysUser> listsysUserAll(SysUser sysUser, PageBean pageBean);

    /**
     * 用户状态启用
     * @param sysUser
     * @return
     */
    int userStart(SysUser sysUser);

    /**
     * 用户状态禁用
     * @param sysUser
     * @return
     */
    int userStop(SysUser sysUser);


    /**
     * 根据userid查看用户信息
     * @param sysUser
     * @return
     */
    SysUser loadSysUserByid(SysUser sysUser);

    /**
     * 根据uesrid修改用户操作人
     * @param sysUser
     * @return
     */
    int updateUserCzr(SysUser sysUser);

    /**
     * 根据userid查询用户个人信息
     * @param sysUser
     * @return
     */
    SysUser findUserByid(SysUser sysUser);
}