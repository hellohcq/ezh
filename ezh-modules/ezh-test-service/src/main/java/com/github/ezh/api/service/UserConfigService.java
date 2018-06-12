package com.github.ezh.api.service;

import com.baomidou.mybatisplus.service.IService;
import com.github.ezh.api.model.dto.UserDto;
import com.github.ezh.api.model.entity.User;
import com.github.ezh.api.model.entity.UserConfig;

import java.util.List;

public interface UserConfigService extends IService<UserConfig> {

    Integer updateByUserId(UserConfig userConfig);

    UserConfig getByUserId(String userId);

    UserConfig getByClientId(String clientId);

    boolean save(UserConfig userConfig);
}
