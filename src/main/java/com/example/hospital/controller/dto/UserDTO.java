package com.example.hospital.controller.dto;

import lombok.Data;

/**
 * 接受前端登录请求数据
 */

@Data
public class UserDTO {
    private String username;
    private String userPassword;
    private String usertype;
}
