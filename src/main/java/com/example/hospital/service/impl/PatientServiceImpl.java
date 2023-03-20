package com.example.hospital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hospital.domain.Patient;
import com.example.hospital.domain.User;
import com.example.hospital.service.PatientService;
import com.example.hospital.mapper.PatientMapper;
import org.springframework.stereotype.Service;

/**
* @author chenz
* @description 针对表【patient】的数据库操作Service实现
* @createDate 2023-02-23 23:49:04
*/
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient>
    implements PatientService{
    public boolean savePatient(Patient patient) {
        return saveOrUpdate(patient);
    }

}




