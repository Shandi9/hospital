package com.example.hospital.controller;


import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.hospital.common.AjaxResult;
import com.example.hospital.common.HttpStatus;
import com.example.hospital.controller.dto.PatientDTO;
import com.example.hospital.controller.dto.UserDTO;
import com.example.hospital.domain.User;
import com.example.hospital.mapper.UserMapper;
import com.example.hospital.service.DoctorService;
import com.example.hospital.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.ognl.security.UserMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    // 登录
    @PostMapping("/login")
    public AjaxResult login(@RequestBody UserDTO userDTO) {
        String username = userDTO.getUsername();
        String password = userDTO.getUserPassword();
        if(StrUtil.isBlank(username) || StrUtil.isBlank(password) ) {
            return AjaxResult.error();
        }
        return AjaxResult.success(userService.login(userDTO));
    }

    // 注册
    @PostMapping("/register")
    public AjaxResult register(@RequestBody UserDTO userDTO) {

        String username = userDTO.getUsername();
        String password = userDTO.getUserPassword();

        if(StrUtil.isBlank(username) || StrUtil.isBlank(password)) {
            return AjaxResult.error();
        }
        return AjaxResult.success(userService.register(userDTO));
    }

    //查询所有
    @GetMapping("/all")
    public AjaxResult findUser() {
        return AjaxResult.success(userService.list());
    }

    //添加更改
    @PostMapping("/save")
    public AjaxResult save(@RequestBody User user) {
        //新增或者更新
        return AjaxResult.success(userService.saveUser(user));
    }

    @DeleteMapping("/{id}")
    public AjaxResult delete(@PathVariable Integer id) {
        return AjaxResult.success(userService.removeById(id));
    }

    @PostMapping("/del/batch")
    public AjaxResult deleteBatch(@RequestBody List<Integer> ids) {
        return AjaxResult.success(userService.removeByIds(ids));
    }
    // 分页查询 - mybatis-plus方式
    @GetMapping("/page")
    public IPage<User> findPage(@RequestParam Integer pageNum,
                                @RequestParam Integer pageSize,
                                @RequestParam(defaultValue = "") String username,
                                @RequestParam(defaultValue = "") String usertype) {
        IPage<User> page = new Page<>(pageNum, pageSize);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (!"".equals(username)) {
            queryWrapper.like("user_name", username);
        }
        if (!"".equals(usertype)) {
            queryWrapper.like("user_type", usertype);
        }
        return userService.page(page, queryWrapper);
    }

}

