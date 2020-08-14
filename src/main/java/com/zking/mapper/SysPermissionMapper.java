package com.zking.mapper;

import com.zking.model.SysPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysPermissionMapper {
    int deleteByPrimaryKey(Integer perid);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Integer perid);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);

    /**
     * 获取根节点
     * @return
     */
    List<SysPermission> queryrootNode(@Param("username") String username);

    /**
     * 获取所有根节点
     * @return
     */
    List<SysPermission> queryNode();

    /**
     * 根据根节点pid查询它的子id
     * @param
     * @param sysPermission
     */
    void queryModuleByPid(@Param("pid") Integer pid, SysPermission sysPermission,@Param("username") String username);

    /**
     * 根据根节点pid查询它的子id
     * @param
     */
    List<SysPermission> queryModuleByperid(@Param("pid") Integer pid,SysPermission sysPermission,@Param("username") String username);



    /**
     * 根据根节点pid查询它的子id(授权)
     * @param pid
     * @param sysPermission
     */
    void queryNodeByPid(Integer pid , SysPermission sysPermission);

    /**
     * 根据根节点pid查询它的子id（授权）
     * @param pid
     */
    List<SysPermission> queryNodeByperid(Integer pid);

}