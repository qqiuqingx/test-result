package com.zian.testresult.service.impl;

import com.zian.testresult.bean.StaffInfo1;
import com.zian.testresult.exceptin.UserNotExiException;
import com.zian.testresult.mapper.staffinfoMapper;
import com.zian.testresult.service.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class StaffImpl implements Staff {

    @Autowired
    private staffinfoMapper staffinfoMapper;

    @Override
    public StaffInfo1 getStaffInfobyKeyID(String KeyID, HttpServletRequest request) {
        StaffInfo1 staffInfobyKeyID = staffinfoMapper.getStaffInfobyKeyID(KeyID);
        System.out.println("查询到的员工信息:"+staffInfobyKeyID);
        if (staffInfobyKeyID==null){

            throw new UserNotExiException("用户不存在");
        }
        return staffInfobyKeyID;
    }
}
