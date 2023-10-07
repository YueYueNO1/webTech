package com.example.webtech.Result;

import com.example.webtech.entity.User;

public class UsersResult  extends BaseResult{
    private boolean usersResult;
    private User user;

    public UsersResult(User user) {
        this.user = user;
        System.out.println("hello");
    }

    public  boolean isUsersResult() {
        return usersResult;
    }

    public void setUsersResult(boolean usersResult) {
        this.usersResult = usersResult;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UsersResult{" +
                "usersResult=" + usersResult +
                '}';
    }
}
