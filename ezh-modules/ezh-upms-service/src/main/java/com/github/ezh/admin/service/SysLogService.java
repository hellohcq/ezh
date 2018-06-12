package com.github.ezh.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.github.ezh.common.entity.SysLog;

/**
 * <p>
 * 日志表 服务类
 * </p>
 *
 * @author solor
 * @since 2017-11-20
 */
public interface SysLogService extends IService<SysLog> {

    /**
     * 通过ID删除日志（逻辑删除）
     *
     * @param id 日志ID
     * @return true/false
     */
    Boolean updateByLogId(Long id);
}
