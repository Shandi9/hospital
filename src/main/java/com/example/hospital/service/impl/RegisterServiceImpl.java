package com.example.hospital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hospital.domain.Register;
import com.example.hospital.domain.User;
import com.example.hospital.service.RegisterService;
import com.example.hospital.mapper.RegisterMapper;
import org.springframework.stereotype.Service;

/**
* @author chenz
* @description 针对表【register】的数据库操作Service实现
* @createDate 2023-02-23 23:49:04
*/
@Service
public class RegisterServiceImpl extends ServiceImpl<RegisterMapper, Register>
    implements RegisterService{

    public boolean saveRegister(Register register) {
        return saveOrUpdate(register);
    }

}




