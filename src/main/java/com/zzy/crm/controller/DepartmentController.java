package com.zzy.crm.controller;


import com.zzy.crm.entity.Department;
import com.zzy.crm.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author PIGS
 * @since 2020-03-23
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private IDepartmentService iDepartmentService;

    @RequestMapping
    public boolean add(Department department){
        return iDepartmentService.save(department);
    }


}
