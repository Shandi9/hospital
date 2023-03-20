package com.example.hospital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hospital.domain.Office;
import com.example.hospital.service.OfficeService;
import com.example.hospital.mapper.OfficeMapper;
import org.springframework.stereotype.Service;

/**
* @author chenz
* @description 针对表【office】的数据库操作Service实现
* @createDate 2023-02-23 23:49:04
*/
@Service
public class OfficeServiceImpl extends ServiceImpl<OfficeMapper, Office>
    implements OfficeService{

}




