package com.zian.testresult.controller;

import com.zian.testresult.VO.StaffUserVO;
import com.zian.testresult.bean.StaffInfo1;
import com.zian.testresult.mapper.staffinfoMapper;
import com.zian.testresult.service.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class testMybatisController {
    @Resource
    Staff staff;
    @Autowired
    staffinfoMapper staffinfoMapper;

    @RequestMapping("/getStaff/{KeyID}")
    public StaffInfo1 getStaffInfoByKeyID(@PathVariable("KeyID") String KeyID, HttpServletRequest request){
        StaffInfo1 staffInfobyKeyID = staff.getStaffInfobyKeyID(KeyID, request);
        return staffInfobyKeyID;
    }
    @GetMapping("/getAll}")
    public List<StaffInfo1> getAllStaffInfo(){

        return staffinfoMapper.getAll();
    }

    //根据员工编号 查询员工和用户信息
    @GetMapping("/getStaffNO/{KeyID}")
    public StaffUserVO getStaffNO(@PathVariable("KeyID") String KeyID){
        StaffInfo1 staffInfobyKeyID = staffinfoMapper.getStaffInfobyKeyID(KeyID);
       StaffUserVO vo= new StaffUserVO();
       vo.setStaffInfo1(staffInfobyKeyID);
       vo.setUserInfo1(staffInfobyKeyID.getUserInfo1());
        return vo;

    }
}
