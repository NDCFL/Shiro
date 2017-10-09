package com.fl.service;

import com.fl.pojo.Module;
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
public class ModuleDAOTest {
    @Resource
    private ModuleService moduleService;
    @Test
    public void testModule(){
        moduleService.delete("f393ccdaacea11e7bdee3f2e2a4af2e2");
        System.out.println(moduleService.queryById("1"));
    }
}
