package com.zzy.crm.mapper;

import com.zzy.crm.entity.Department;
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
public class PermissionMapperTest {

    @Autowired
    private PermissionMapper permissionMapper;

    @Test
    public void list() {
        for (Permission permission : permissionMapper.selectList(null)) {
            System.out.println(permission);
        }
    }


    @Test
    public void add () {

        Permission permission = new Permission();
        permission.setPermId(null);
        permission.setPermName("用户添加");
        permission.setUrl("/userAdd");
        permission.setPermission("user:add");
        permission.setCreateTime("2020-03-23 18:57:46");
        permission.setUpdateTime("2020-03-23 18:57:46");
        permission.setIsDel(0);

        int add = permissionMapper.insert(permission);
        System.out.println(add);
    }
    @Test
    public void update(){

        Permission permission =new Permission();
        permission.setPermId(2);
        permission.setPermName("用户修改");
        permission.setUrl("/userDelete");
        permission.setPermission("user:del");
        int update=permissionMapper.updateById(permission);
        System.out.println(update);
    }

    @Test
    public void del(){
        System.out.println(permissionMapper.deleteById(2));
    }




}