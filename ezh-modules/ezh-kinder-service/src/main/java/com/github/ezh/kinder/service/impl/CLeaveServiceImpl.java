package com.github.ezh.kinder.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.ezh.kinder.mapper.CLeaveMapper;
import com.github.ezh.kinder.model.dto.AttendanceBabyDto;
import com.github.ezh.kinder.model.dto.AttendanceSelfDto;
import com.github.ezh.kinder.model.dto.CLeaveDto;
import com.github.ezh.kinder.model.entity.CLeave;
import com.github.ezh.kinder.service.CLeaveService;
import org.springframework.stereotype.Service;

import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class CLeaveServiceImpl extends ServiceImpl<CLeaveMapper, CLeave> implements CLeaveService {

    @Override
    public CLeaveDto getById(String id) {
        return baseMapper.getById(id);
    }

    @Override
    public CopyOnWriteArrayList<CLeaveDto> getLeaveList(CLeave cLeave, String userType, Integer offset, Integer limit) {
        return baseMapper.getLeaveList(cLeave,userType,offset,limit);
    }

    @Override
    public boolean readLeave(String id, String userId) {
        return baseMapper.readLeave(id,userId) == 1;
    }

    @Override
    public boolean audited(CLeave cLeave) {
        return baseMapper.audited(cLeave) == 1;
    }

    @Override
    public boolean deleteFlag(String id) {
        return baseMapper.deleteFlag(id) == 1;
    }

    @Override
    public CopyOnWriteArrayList<AttendanceSelfDto> getSelfAttendanceByMonth(String userId, String year, String month) {
        return baseMapper.getSelfAttendanceByMonth(userId,year,month);
    }

    @Override
    public CopyOnWriteArrayList<AttendanceBabyDto> getBabyAttendanceByDate(String officeId, String classId, String selDate) {
        return baseMapper.getBabyAttendanceByDate(officeId,classId,selDate);
    }

    @Override
    public String getAllBabyAttendanceByDate(String officeId, String classId, String selDate) {
        return baseMapper.getAllBabyAttendanceByDate(officeId,classId,selDate);
    }
}