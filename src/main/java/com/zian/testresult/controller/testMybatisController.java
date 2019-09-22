package com.zian.testresult.controller;

import com.zian.testresult.bean.StaffInfo1;
import com.zian.testresult.mapper.staffinfoMapper;
import com.zian.testresult.service.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class testMybatisController {
    @Autowired
    Staff staff;


    @RequestMapping("/getStaff/{KeyID}")
    public StaffInfo1 getStaffInfoByKeyID(@PathVariable("KeyID") String KeyID, HttpServletRequest request){

       /* if(KeyID==null||"".equals(KeyID)){
            System.err.println("参数为空");
            return new StaffInfo1();
        }*/
        StaffInfo1 staffInfobyKeyID = staff.getStaffInfobyKeyID(KeyID, request);

        return staffInfobyKeyID;
    }
}
