package com.zian.testresult.mapper;

import com.zian.testresult.VO.StaffUserVO;
import com.zian.testresult.bean.StaffInfo1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//指定这是个mapper
@Mapper
public interface staffinfoMapper {
    //查询员工
   // @Select("SELECT * FROM StaffInfo1 where KeyID=#{KeyID}")
    StaffInfo1 getStaffInfobyKeyID(String KeyID);

    //查询所有
    List<StaffInfo1> getAll();

    //根据员工编号 查询员工和用户信息
    StaffUserVO getStaffNO(String StaffNO);



}
