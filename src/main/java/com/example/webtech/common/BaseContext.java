package com.example.webtech.common;
/**
 * @author shkstart
 * @create 2022-10-2022/10/13 15:06
 */
/*
基于threadLocal封装工具类、用户保存和获取当前登录用户id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
