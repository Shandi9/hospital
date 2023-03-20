package com.example.hospital.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.hospital.common.AjaxResult;
import com.example.hospital.domain.Patient;
import com.example.hospital.domain.User;
import com.example.hospital.service.PatientService;
import com.example.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/patient")
@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    //查询所有
    @GetMapping("/all")
    public AjaxResult findPatient() {
        return AjaxResult.success(patientService.list());
    }

    //添加更改
    @PostMapping("/save")
    public AjaxResult save(@RequestBody Patient patient) {
        //新增或者更新
        return AjaxResult.success(patientService.savePatient(patient));
    }

    @DeleteMapping("/{id}")
    public AjaxResult delete(@PathVariable Integer id) {
        return AjaxResult.success(patientService.removeById(id));
    }

    @PostMapping("/del/batch")
    public AjaxResult deleteBatch(@RequestBody List<Integer> ids) {
        return AjaxResult.success(patientService.removeByIds(ids));
    }
    // 分页查询 - mybatis-plus方式
    @GetMapping("/page")
    public IPage<Patient> findPage(@RequestParam Integer pageNum,
                                @RequestParam Integer pageSize,
                                @RequestParam(defaultValue = "") String patientName,
                                @RequestParam(defaultValue = "") String patientDoctor) {
        IPage<Patient> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Patient> queryWrapper = new QueryWrapper<>();
        if (!"".equals(patientName)) {
            queryWrapper.like("patient_name", patientName);
        }
        if (!"".equals(patientDoctor)) {
            queryWrapper.like("patient_doctor", patientDoctor);
        }
        return patientService.page(page, queryWrapper);
    }
}
