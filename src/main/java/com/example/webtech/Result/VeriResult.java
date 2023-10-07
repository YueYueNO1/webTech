package com.example.webtech.Result;

import com.example.webtech.entity.Verification;

public class VeriResult  extends BaseResult{
    private boolean VeriResult;
    private Verification verification;

    public VeriResult(Verification verification) {
        this.verification = verification;
        System.out.println("hello "+ verification);
    }

    public boolean isVeriResult() {
        return VeriResult;
    }

    public void setUsersResult(boolean VeriResult) {
        this.VeriResult = VeriResult;
    }

    public Verification getVerification() {
        return verification;
    }

    @Override
    public String toString() {
        return "VeriResult{" +
                "VeriResult=" + verification +
                '}';
    }
}
