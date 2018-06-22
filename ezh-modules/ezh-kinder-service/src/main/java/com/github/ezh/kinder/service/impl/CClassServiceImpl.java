package com.github.ezh.kinder.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.ezh.kinder.mapper.CClassMapper;
import com.github.ezh.kinder.model.dto.CClassDto;
import com.github.ezh.kinder.model.entity.CClass;
import com.github.ezh.kinder.service.CClassService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典表 服务实现类
 */
@Service
public class CClassServiceImpl extends ServiceImpl<CClassMapper, CClass> implements CClassService {

    @Override
    public List<CClassDto> getByOfficeId(CClass cclass) {
        return baseMapper.getByOfficeId(cclass);
    }

    @Override
    public CClassDto getByTeacherId(String teacherId) {
        return baseMapper.getByTeacherId(teacherId);
    }
}