package com.example.hospital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hospital.domain.Doctor;
import com.example.hospital.domain.User;
import com.example.hospital.mapper.UserMapper;
import com.example.hospital.service.DoctorService;
import com.example.hospital.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author chenz
* @description 针对表【doctor】的数据库操作Service实现
* @createDate 2023-02-23 23:49:04
*/
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor>
    implements DoctorService{

    public boolean saveDoctor(Doctor doctor) {
        return saveOrUpdate(doctor);
    }
}




