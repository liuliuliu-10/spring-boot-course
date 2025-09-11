package com.example.week1.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liuliu
 * @Date: 2025/9/5
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "lyf.sms.ccp")
public class CloopenConfig {

    private String serverIp;
    private String port;
    private String accountSId;
    private String accountToken;
    private String appId;
    private String templateId;

}
