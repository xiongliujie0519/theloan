package com.zking.mapper;

import com.zking.model.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface SysUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 用户登入
     * @param username
     * @return
     */
    SysUser userLogin(@Param("username") String username);

    /**
     * 用户注册
     * @param sysUser
     * @return
     */
    int RegUser(SysUser sysUser);


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
     * 查询所有用户信息
     * @param sysUser
     * @return
     */
    List<SysUser> listsysUserAll(SysUser sysUser);

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