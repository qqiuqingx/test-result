package com.zian.testresult.mapper;

import com.zian.testresult.bean.StaffInfo1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//指定这是个mapper
@Mapper
public interface staffinfoMapper {

    @Select("SELECT * FROM StaffInfo1 where KeyID=#{KeyID}")
    StaffInfo1 getStaffInfobyKeyID(String KeyID);


}
