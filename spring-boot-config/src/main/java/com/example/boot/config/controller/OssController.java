package com.example.boot.config.controller;

import com.example.boot.config.service.OssService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: liuliu
 * @Date: 2025/9/11
 */
@RestController
@RequestMapping("/oss")
public class OssController {
    @Resource
    private OssService ossService;

    @RequestMapping("/upload")
    public String upload(MultipartFile file){
        return ossService.upload(file);
    }
}
