package com.zian.testresult.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

@Controller
public class TestJDBCController {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @ResponseBody
    @RequestMapping("/getJDBC")
    public Map<String,Object> gets(){

        List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT * FROM StaffInfo1");

        return maps.get(0);
    }

}
