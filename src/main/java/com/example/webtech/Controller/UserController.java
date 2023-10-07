package com.example.webtech.Controller;

import com.example.webtech.Result.UsersResult;
import com.example.webtech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public UsersResult login(String accountNum, String password){
        return userService.login(accountNum,password);
    }

    @RequestMapping("register")
    @ResponseBody
    public UsersResult register(String accountNum,String username, String password){
        return userService.register(accountNum,username,password);
    }
}
