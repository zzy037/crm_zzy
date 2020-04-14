package com.zzy.crm.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zzy.crm.entity.Employee;
import com.zzy.crm.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author 邹靓仔
 * @date 2020/3/23 -16:56 -zzy_crm
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void select(){
        System.out.println(employeeMapper.selectById(1));
    }

    @Test
    public void login(){
        QueryWrapper<Employee> queryWrapper =new QueryWrapper<>();
        System.out.println(employeeMapper.selectOne(queryWrapper.eq("emp_name","admin")
        .eq("pwd","123456")));
    }

    @Test
    public void add(){

        Employee role =new Employee();
        role.setEmpId(null);
        role.setEmpName("小红");
        role.setPwd("123456");
        role.setSalt("111");
        role.setAge(24);
        role.setSex("女");
        role.setPhone("123123");
        role.setAddress("河源");
        role.setCreateTime("2020-03-23 18:57:46");
        role.setUpdateTime("2020-03-23 18:57:46");
        role.setIsDel(0);

        int add=employeeMapper.insert(role);
        System.out.println(add);
    }

    @Test
    public void update(){

        Employee role =new Employee();
        role.setEmpId(2);
        role.setEmpName("管理员");
        int update=employeeMapper.updateById(role);
        System.out.println(update);
    }

    @Test
    public void del(){
        System.out.println(employeeMapper.deleteById(2));
    }


}