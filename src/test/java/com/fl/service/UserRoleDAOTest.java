package com.fl.service;

import com.fl.pojo.UserRole;
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
public class UserRoleDAOTest {
    @Resource
    private UserRoleService userRoleService;
    @Test
    public void testFindUserRole(){
        userRoleService.delete("a3134cf2ace711e7bdee3f2e2a4af2e2");
        System.out.println(userRoleService.queryById("1"));
    }
}
