package com.example.hospital.mapper;

import com.example.hospital.common.AjaxResult;
import com.example.hospital.domain.Patient;
import com.example.hospital.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
* @author chenz
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-02-23 23:49:04
* @Entity com.example.hospital.domain.User
*/
//@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    @Insert("INSERT into patient(patient_name,type) SELECT user_name,user_type where not exists (from user where user.user_type = '0')")
    int insertPatient();

        @Insert("INSERT into doctor(doctor_name,type) SELECT user_name,user_type where not exists (from user where user.user_type = '1')")
    int insertDoctor();

}




