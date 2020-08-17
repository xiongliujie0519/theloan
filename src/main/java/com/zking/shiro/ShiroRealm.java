package com.zking.shiro;


import com.zking.model.SysUser;
import com.zking.service.ISysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private ISysUserService sysUserService;
    /**
     * 授权认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户名
        String username = principalCollection.getPrimaryPrincipal().toString();
        //获取用户角色名
        Set<String> roles = sysUserService.findRole(username);
        //获取角色的权限名
        Set<String> permissions = sysUserService.findPermission(username);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roles);
        simpleAuthorizationInfo.setStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }

    /**
     * 身份认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取用户通过请求发送过来的账号密码
        String username = authenticationToken.getPrincipal().toString();
        String password = authenticationToken.getCredentials().toString();
        //根据用户账户到数据库找到对应的用户信息
        SysUser sysUser = sysUserService.userLogin(username);
        //判断该用户是否存在
        if(null == sysUser){
            throw new RuntimeException("没有这个用户");
        }
        System.out.println(sysUser.getSalt());
        //将数据库数据交给shiro进行匹配
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                sysUser.getUsername(),
                sysUser.getPassword(),
                ByteSource.Util.bytes(sysUser.getSalt()),
                this.getName()
        );
        return simpleAuthenticationInfo;
    }
}
