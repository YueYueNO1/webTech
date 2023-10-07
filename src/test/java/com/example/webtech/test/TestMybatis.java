package com.example.webtech.test;

import com.example.webtech.Mapper.UserMapper;
import com.example.webtech.Mapper.VeriMapper;
import com.example.webtech.entity.User;
import com.example.webtech.entity.Verification;
import com.mysql.cj.jdbc.Blob;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.junit.jupiter.api.Test;

import org.apache.ibatis.io.Resources;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

public class TestMybatis {
    @Test
    public void testHelloWorld() throws IOException{
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        Integer count = sqlSession.getMapper(UserMapper.class).findCount();
        User user = sqlSession.getMapper(UserMapper.class).findById("7777777");
        User user1 = sqlSession.getMapper(UserMapper.class).login("7777777","7777777");
        System.out.println("count"+count);
        System.out.println("user"+user1.toString());
        sqlSession.close();
    }
    @Test
    public void test() throws IOException, SQLException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        User user = sqlSession.getMapper(UserMapper.class).register("740740","740740","740740");
        User user1 = sqlSession.getMapper(UserMapper.class).findById("740740");
        System.out.println("user"+user1.toString());
        sqlSession.close();
    }
}
