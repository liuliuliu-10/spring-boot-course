package com.example.week1.service;

/**
 * @Author: liuliu
 * @Date: 2025/9/5
 */

public interface SmsService {
    /**
     * 发送短信
     *
     * @param phone 手机号
     */
    void sendSms(String phone);
}
