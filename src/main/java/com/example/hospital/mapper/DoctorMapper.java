package com.example.hospital.mapper;

import com.example.hospital.domain.Doctor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hospital.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author chenz
* @description 针对表【doctor】的数据库操作Mapper
* @createDate 2023-02-23 23:49:04
* @Entity com.example.hospital.domain.Doctor
*/
@Mapper
@Repository
public interface DoctorMapper extends BaseMapper<Doctor> {
         @Select("select * from doctor")
         List<Doctor> findall();
}




