package com.example.boot.config.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @Author: liuliu
 * @Date: 2025/9/12
 */
@Data
public class Mail {
    @NotBlank
    @Email
    private String to;

    @NotBlank
    private String subject;

    @NotBlank
    private String content;

}
