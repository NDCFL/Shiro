package com.fl.service;

import com.fl.pojo.Permission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by chenfeilong on 2017/10/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/config/spring-applicationContext.xml", "classpath:/config/spring-mybatis.xml"})

public class PermissionDAOTest {
    @Resource
    private PermissionService permissionService;
    @Test
    public void testPermission(){
        Permission permission = new Permission();
        permission.setCreateTime(new Date());
        permission.setId("35c025a8acc911e79af1ec80be39e2c2");
        permissionService.update(permission);
        System.out.println(permissionService.queryById("35c025a8acc911e79af1ec80be39e2c2"));
    }
}
