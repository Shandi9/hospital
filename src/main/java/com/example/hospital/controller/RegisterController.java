package com.example.hospital.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.hospital.common.AjaxResult;
import com.example.hospital.domain.Doctor;
import com.example.hospital.domain.Register;
import com.example.hospital.domain.User;
import com.example.hospital.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("register")
@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    //查询所有
    @GetMapping("/all")
    public AjaxResult findRegister() {
        return AjaxResult.success(registerService.list());
    }

    //添加更改
    @PostMapping("/save")
    public AjaxResult save(@RequestBody Register register) {
        //新增或者更新
        return AjaxResult.success(registerService.saveRegister(register));
    }

    @DeleteMapping("/{id}")
    public AjaxResult delete(@PathVariable Integer id) {
        return AjaxResult.success(registerService.removeById(id));
    }

    @PostMapping("/del/batch")
    public AjaxResult deleteBatch(@RequestBody List<Integer> ids) {
        return AjaxResult.success(registerService.removeByIds(ids));
    }


    @GetMapping("/page")
    public IPage<Register> findPage(@RequestParam Integer pageNum,
                                  @RequestParam Integer pageSize,
                                  @RequestParam(defaultValue = "") String RegisterDid,
                                  @RequestParam(defaultValue = "") String RegisterPid,
                                    @RequestParam(defaultValue = "") String RegisterOffice
                                    ) {
        IPage<Register> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Register> queryWrapper = new QueryWrapper<>();
        if (!"".equals(RegisterPid)) {
            queryWrapper.like("register_pid", RegisterPid);
        }
        if (!"".equals(RegisterDid)) {
            queryWrapper.like("register_did", RegisterDid);
        }
        if (!"".equals(RegisterOffice)) {
            queryWrapper.like("register_office", RegisterOffice);
        }
        return registerService.page(page, queryWrapper);
    }


}
