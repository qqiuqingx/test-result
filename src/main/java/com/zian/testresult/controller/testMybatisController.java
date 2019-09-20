package com.zian.testresult.controller;

import com.zian.testresult.bean.StaffInfo1;
import com.zian.testresult.mapper.staffinfoMapper;
import com.zian.testresult.service.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class testMybatisController {
    @Autowired
    Staff staff;


    @RequestMapping("/getStaff/{KeyID}")
    public StaffInfo1 getStaffInfoByKeyID(@PathVariable("KeyID") String KeyID){
        return staff.getStaffInfobyKeyID(KeyID);
    }
}
