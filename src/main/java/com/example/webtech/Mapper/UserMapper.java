package com.example.webtech.Mapper;

import com.example.webtech.entity.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface UserMapper {
    public Integer findCount();
    public User findById(String id);
    public User login(@Param("accountNum") String id, @Param("password") String password);
    public User register(@Param("accountNum") String id, @Param("username") String username, @Param("password") String password);
}
