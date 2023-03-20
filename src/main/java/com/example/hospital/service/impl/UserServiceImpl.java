package com.example.hospital.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hospital.common.AjaxResult;
import com.example.hospital.controller.dto.PatientDTO;
import com.example.hospital.controller.dto.UserDTO;
import com.example.hospital.domain.Patient;
import com.example.hospital.domain.User;
import com.example.hospital.service.UserService;
import com.example.hospital.mapper.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.ServerException;
import java.util.List;

/**
* @author chenz
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-02-23 23:49:04
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Autowired
    private UserMapper userMapper;

    public boolean saveUser(User user) {
        return saveOrUpdate(user);
        }

    @Override
    public AjaxResult login(UserDTO userDTO) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",userDTO.getUsername());
        queryWrapper.eq("user_password",userDTO.getUserPassword());
        User one = getOne(queryWrapper);
        if (one != null){
            return AjaxResult.success(one);
        } else {
            return AjaxResult.error();
        }
//        User one = getUserInfo(userDTO);
//        if(one != null){
//            BeanUtil.copyProperties(one,userDTO,true);
//            return AjaxResult.success(one);
//        }else {
//            return AjaxResult.error();
//        }
    }

    @Override
    public User register(UserDTO userDTO) {
        User one = getUserInfo(userDTO);
        if(one == null){
            one = new User();
            BeanUtil.copyProperties(userDTO,one,true);
            save(one); // 把copy完后的用户存储到数据库
            if(one.getUserType().equals("0")){
                userMapper.insertPatient();
            }else if(one.getUserType().equals("1")){
                userMapper.insertDoctor();
            }
        }
        return one;
    }
    private User getUserInfo(UserDTO userDTO){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",userDTO.getUsername());
        queryWrapper.eq("user_password",userDTO.getUserPassword());
        queryWrapper.eq("user_type",userDTO.getUsertype());
        User one = getOne(queryWrapper);
        if (one != null){
            return one;
        } else {
            return null;
        }
    }
}




