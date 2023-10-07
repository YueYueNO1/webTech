package com.example.webtech.service;

import com.example.webtech.Result.UsersResult;

public interface UserService {
    public UsersResult login(String accountNum,String upwd);
    public UsersResult findById(String accountNum);
    public UsersResult register(String accountNum,String username,String upwd);
}
