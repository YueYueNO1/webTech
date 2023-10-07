package com.example.webtech.service;

import com.example.webtech.Result.VeriResult;
import com.example.webtech.entity.Verification;
import org.springframework.stereotype.Service;

public interface VeriService {
    public VeriResult findByImg(String id);
}
