package com.zzy.crm.mapper;

import com.zzy.crm.entity.Permission;
import com.zzy.crm.entity.Role;
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
public class RoleMapperTest {

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void list() {
        for (Role role : roleMapper.selectList(null)) {
            System.out.println(role);
        }
    }
    @Test
    public void add(){

       Role role =new Role();
       role.setRoleId(null);
       role.setRoleName("普通用户");
       role.setCreateTime("2020-03-23 18:57:46");
       role.setUpdateTime("2020-03-23 18:57:46");
       role.setIsDel(0);

       int add=roleMapper.insert(role);
        System.out.println(add);
    }

    @Test
    public void update(){

        Role role =new Role();
        role.setRoleId(2);
        role.setRoleName("管理员");
        int update=roleMapper.updateById(role);
        System.out.println(update);
    }

    @Test
    public void del(){
        System.out.println(roleMapper.deleteById(2));
    }

}