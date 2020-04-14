package com.zzy.crm.mapper;

import com.zzy.crm.entity.Department;
import com.zzy.crm.entity.Permission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author 邹靓仔
 * @date 2020/3/23 -18:53 -zzy_crm
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DepartmentMapperTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void list(){
        for (Department department:departmentMapper.selectList(null)){
            System.out.println(department);
        }

    }
    @Test
    public void add () {

        Department department = new Department();
        department.setDeptId(null);
        department.setDeptName("人力资源部");
        department.setCreateTime("2020-03-23 18:57:46");
        department.setUpdateTime("2020-03-23 18:57:46");
        department.setIsDel(0);
        int add = departmentMapper.insert(department);
        System.out.println(add);
    }
    @Test
    public void update(){

        Department permission =new Department();
        permission.setDeptId(2);
        permission.setDeptName("技术部");
        int update=departmentMapper.updateById(permission);
        System.out.println(update);
    }

    @Test
    public void del(){
        System.out.println(departmentMapper.deleteById(2));
    }



}