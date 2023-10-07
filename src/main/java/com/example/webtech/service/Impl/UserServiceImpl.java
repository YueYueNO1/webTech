package com.example.webtech.service.Impl;

import com.example.webtech.Mapper.UserMapper;
import com.example.webtech.Result.UsersResult;
import com.example.webtech.entity.User;
import com.example.webtech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UsersResult login(String accountNum, String upwd) {
        User login = userMapper.login(accountNum, upwd);
        UsersResult usersResult = new UsersResult(login);

        if(login!= null){
            usersResult.setUsersResult(true);
            usersResult.setMessage("登录成功a");

        }else{
            usersResult.setUsersResult(false);
            usersResult.setMessage("账户或者密码错误，请重新登录");
        }
        usersResult.setResult(true);
        return usersResult;
    }

    @Override
    public UsersResult findById(String accountNum) {
        return null;
    }


    @Override
    public UsersResult register(String accountNum, String username, String upwd) {
        User user = userMapper.findById(accountNum);
        if(user != null){
            UsersResult usersResult = new UsersResult(user);
            usersResult.setUsersResult(false);
            usersResult.setMessage("账户已存在");
            return usersResult;
        }
        User register = userMapper.register(accountNum,username, upwd);
        UsersResult usersResult = new UsersResult(register);

        if(register!= null){
            usersResult.setUsersResult(true);
            usersResult.setMessage("注册成功a");

        }else{
            usersResult.setUsersResult(false);
            usersResult.setMessage("账户或者密码错误，请重新登录");
        }
        usersResult.setResult(true);
        return usersResult;
    }
}
