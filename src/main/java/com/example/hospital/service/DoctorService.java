package com.example.hospital.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hospital.controller.dto.DoctorDTO;
import com.example.hospital.controller.dto.UserDTO;
import com.example.hospital.domain.Doctor;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.hospital.domain.Office;
import com.example.hospital.domain.Patient;
import com.example.hospital.domain.User;
import com.example.hospital.mapper.PatientMapper;
import com.example.hospital.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
* @author chenz
* @description 针对表【doctor】的数据库操作Service
* @createDate 2023-02-23 23:49:04
*/
public interface DoctorService extends IService<Doctor> {

        boolean saveDoctor(Doctor doctor);

}