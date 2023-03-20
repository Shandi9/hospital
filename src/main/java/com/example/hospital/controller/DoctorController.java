package com.example.hospital.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.hospital.common.AjaxResult;
import com.example.hospital.domain.Doctor;
import com.example.hospital.domain.User;
import com.example.hospital.mapper.DoctorMapper;
import com.example.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("/doctor")
@RestController
public class DoctorController {
        @Autowired
        private DoctorService doctorService;

        //查询所有
        @GetMapping("/all")
        public AjaxResult findDoctor() {
                return AjaxResult.success(doctorService.list());
        }

        @PostMapping("/save")
        public AjaxResult save(@RequestBody Doctor doctor) {
                //新增或者更新
                return AjaxResult.success(doctorService.saveDoctor(doctor));
        }

        //删除
        @DeleteMapping("/{id}")
        public AjaxResult delete(@PathVariable Integer id) {
                return AjaxResult.success(doctorService.removeById(id));
        }

        @PostMapping("/del/batch")
        public AjaxResult deleteBatch(@RequestBody List<Integer> ids) {
                return AjaxResult.success(doctorService.removeByIds(ids));
        }

        @GetMapping("/page")
        public IPage<Doctor> findPage(@RequestParam Integer pageNum,
                                    @RequestParam Integer pageSize,
                                    @RequestParam(defaultValue = "") String doctorName,
                                    @RequestParam(defaultValue = "") String doctorOffice) {
                IPage<Doctor> page = new Page<>(pageNum, pageSize);
                QueryWrapper<Doctor> queryWrapper = new QueryWrapper<>();
                if (!"".equals(doctorName)) {
                        queryWrapper.like("doctor_name", doctorName);
                }
                if (!"".equals(doctorOffice)) {
                        queryWrapper.like("doctor_office", doctorOffice);
                }
                return doctorService.page(page, queryWrapper);
        }

}
