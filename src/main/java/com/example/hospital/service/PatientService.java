package com.example.hospital.service;

import com.example.hospital.domain.Patient;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author chenz
* @description 针对表【patient】的数据库操作Service
* @createDate 2023-02-23 23:49:04
*/
public interface PatientService extends IService<Patient> {

    boolean savePatient(Patient patient);
}
