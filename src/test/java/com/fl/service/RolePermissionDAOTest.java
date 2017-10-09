package com.fl.service;

import com.fl.pojo.RolePermission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by chenfeilong on 2017/10/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/config/spring-applicationContext.xml", "classpath:/config/spring-mybatis.xml"})

public class RolePermissionDAOTest {
    @Resource
    private RolePermissionService rolePermissionService;
    @Test
    public void testRolePermission(){
        rolePermissionService.delete("5006b1ccacea11e7bdee3f2e2a4af2e2");
        System.out.println(rolePermissionService.queryById("1"));
    }
}
