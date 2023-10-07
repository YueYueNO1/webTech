package com.example.webtech.service.Impl;

import com.example.webtech.Mapper.VeriMapper;
import com.example.webtech.Result.UsersResult;
import com.example.webtech.Result.VeriResult;
import com.example.webtech.entity.User;
import com.example.webtech.entity.Verification;
import com.example.webtech.service.VeriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeriServiceImpl implements VeriService {
    @Autowired
    private VeriMapper veriMapper;
    @Override
    public VeriResult findByImg(String id) {
        Verification pic = veriMapper.findByImg(id);
        VeriResult veriResult = new VeriResult(pic);
        System.out.println(veriResult);

        if(veriResult!= null){
            veriResult.setUsersResult(true);
            veriResult.setMessage("登录成功a1");

        }else{
            veriResult.setUsersResult(false);
            veriResult.setMessage("验证码有误，请重新输入");
        }
        veriResult.setResult(true);
        return veriResult;


    }
}
