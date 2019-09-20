package com.zian.testresult.bean;

public class UserInfo1 {
    private String KeyID;
    private String UserNO;
    private String UserName;
    private String password;

    @Override
    public String toString() {
        return "UserInfo1{" +
                "KeyID='" + KeyID + '\'' +
                ", UserNO='" + UserNO + '\'' +
                ", UserName='" + UserName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getKeyID() {
        return KeyID;
    }

    public void setKeyID(String keyID) {
        KeyID = keyID;
    }

    public String getUserNO() {
        return UserNO;
    }

    public void setUserNO(String userNO) {
        UserNO = userNO;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
