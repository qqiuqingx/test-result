package com.zian.testresult.service.impl;

import com.zian.testresult.bean.StaffInfo1;
import com.zian.testresult.mapper.staffinfoMapper;
import com.zian.testresult.service.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffImpl implements Staff {

    @Autowired
    private staffinfoMapper staffinfoMapper;

    @Override
    public StaffInfo1 getStaffInfobyKeyID(String KeyID) {

        return staffinfoMapper.getStaffInfobyKeyID(KeyID);
    }
}
