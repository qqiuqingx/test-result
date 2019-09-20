package com.zian.testresult;

import jdk.nashorn.internal.objects.annotations.Where;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestResultApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    public void contextLoads() throws SQLException {
        System.out.println("数据源信息:"+dataSource.getClass());
        //获取数据库连接
        Connection connection = dataSource.getConnection();
        //通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from StaffInfo1");
        //.处理数据库的返回结果(使用ResultSet类)
        while (resultSet.next()){
            System.out.println(resultSet.getString("CompanyName"));
        }



        connection.close();
    }

}
