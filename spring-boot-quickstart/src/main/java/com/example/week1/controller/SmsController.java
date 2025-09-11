package com.example.week1.controller;

import com.example.week1.service.SmsService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuliu
 * @Date: 2025/9/5
 */
@RestController
public class SmsController {
    @Resource
    private SmsService smsService;

    @GetMapping("/sms")
    public void sendSms(String phone) {
        smsService.sendSms(phone);
    }
}
