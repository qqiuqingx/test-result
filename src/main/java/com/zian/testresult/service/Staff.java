package com.zian.testresult.service;

import com.zian.testresult.bean.StaffInfo1;

import javax.servlet.http.HttpServletRequest;

public interface Staff {

    public StaffInfo1 getStaffInfobyKeyID(String KeyID, HttpServletRequest request);

}
