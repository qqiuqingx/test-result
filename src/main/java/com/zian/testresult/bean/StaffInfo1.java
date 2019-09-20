package com.zian.testresult.bean;

import com.fasterxml.jackson.core.SerializableString;

public class StaffInfo1 {

    private String keyid;
    private String CompanyNO;
    private String CompanyName;
    private Integer Gender;
    private String UserNO;
    private  String Name;
    private String StaffNO;
    private  String Phone;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStaffNO() {
        return StaffNO;
    }

    public void setStaffNO(String staffNO) {
        StaffNO = staffNO;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getUserNO() {
        return UserNO;
    }

    public void setUserNO(String userNO) {
        UserNO = userNO;
    }



    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid;
    }

    public String getCompanyNO() {
        return CompanyNO;
    }

    public void setCompanyNO(String companyNO) {
        CompanyNO = companyNO;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public Integer getGender() {
        return Gender;
    }

    public void setGender(Integer gender) {
        Gender = gender;
    }
}
