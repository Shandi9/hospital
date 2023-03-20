package com.example.hospital.service;

import com.example.hospital.domain.Register;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author chenz
* @description 针对表【register】的数据库操作Service
* @createDate 2023-02-23 23:49:04
*/
public interface RegisterService extends IService<Register> {

    boolean saveRegister(Register register);
}
