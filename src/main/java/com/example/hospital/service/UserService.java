package com.example.hospital.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hospital.common.AjaxResult;
import com.example.hospital.controller.dto.PatientDTO;
import com.example.hospital.controller.dto.UserDTO;
import com.example.hospital.domain.Room;
import com.example.hospital.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.hospital.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author chenz
* @description 针对表【user】的数据库操作Service
* @createDate 2023-02-23 23:49:04
*/
public interface UserService extends IService<User> {

  boolean saveUser(User user);

  AjaxResult login(UserDTO userDTO);

  User register(UserDTO userDTO);
}
