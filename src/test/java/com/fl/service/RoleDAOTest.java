package com.fl.service;

import com.fl.pojo.Role;
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
public class RoleDAOTest {
    @Resource
    private RoleService roleService;
    @Test
    public void testFindRole(){
        Role role = new Role();
        role.setRoleName("teacher");
        role.setRoleRemark("teacher handle");
        role.setId("e0ba70beacc711e79af1ec80be39e2c2");
        roleService.update(role);
        System.out.println(roleService.queryById("1"));
    }
}
