package com.example.hospital.mapper;

import com.example.hospital.domain.Patient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hospital.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author chenz
* @description 针对表【patient】的数据库操作Mapper
* @createDate 2023-02-23 23:49:04
* @Entity com.example.hospital.domain.Patient
*/
@Mapper
@Repository
public interface PatientMapper extends BaseMapper<Patient> {
    @Select("select * from patient")
    List<Patient> findall();
}




