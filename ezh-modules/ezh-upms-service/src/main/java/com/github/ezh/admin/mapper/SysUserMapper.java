package com.github.ezh.admin.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.github.ezh.admin.model.entity.SysUser;
import com.github.ezh.common.bean.interceptor.DataScope;
import com.github.ezh.common.util.Query;
import com.github.ezh.common.vo.UserVo;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author solor
 * @since 2017-10-29
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * 通过用户名查询用户信息（含有角色信息）
     *
     * @param username 用户名
     * @return userVo
     */
    UserVo selectUserVoByUsername(String username);

    /**
     * 分页查询用户信息（含角色）
     *
     * @param dataScope 数据权限
     * @param query     查询条件
     * @return list
     */
    List selectUserVoPageDataScope(Query query, DataScope dataScope);

    /**
     * 通过手机号查询用户信息（含有角色信息）
     *
     * @param mobile 用户名
     * @return userVo
     */
    UserVo selectUserVoByMobile(String mobile);

    /**
     * 通过openId查询用户信息
     *
     * @param openId openid
     * @return userVo
     */
    UserVo selectUserVoByOpenId(String openId);

    /**
     * 通过ID查询用户信息
     *
     * @param id 用户ID
     * @return userVo
     */
    UserVo selectUserVoById(Integer id);
}