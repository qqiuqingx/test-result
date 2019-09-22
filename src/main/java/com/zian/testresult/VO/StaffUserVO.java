package com.zian.testresult.VO;

import com.zian.testresult.bean.StaffInfo1;
import com.zian.testresult.bean.UserInfo1;

public class StaffUserVO {
    private StaffInfo1 staffInfo1;
    private UserInfo1 userInfo1;

    @Override
    public String toString() {
        return "StaffUserVO{" +
                "staffInfo1=" + staffInfo1 +
                ", userInfo1=" + userInfo1 +
                '}';
    }

    public StaffInfo1 getStaffInfo1() {
        return staffInfo1;
    }

    public void setStaffInfo1(StaffInfo1 staffInfo1) {
        this.staffInfo1 = staffInfo1;
    }

    public UserInfo1 getUserInfo1() {
        return userInfo1;
    }

    public void setUserInfo1(UserInfo1 userInfo1) {
        this.userInfo1 = userInfo1;
    }
}
