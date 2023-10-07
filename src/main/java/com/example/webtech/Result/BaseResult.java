package com.example.webtech.Result;

public class BaseResult {
    private boolean result;
    private String message;

    public boolean isResult(){
        return result;
    }
    public void setResult(boolean result){
        this.result=result;
    }
    public String getMessage(){
        return  message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    @Override
    public String toString() {
        return "BaseResult{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}
