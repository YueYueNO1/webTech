package com.example.webtech.Mapper;

import com.example.webtech.entity.User;
import com.example.webtech.entity.Verification;

public interface VeriMapper {
    public Verification findByImg(String num);
}
