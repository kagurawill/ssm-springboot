package com.wzy;

import com.wzy.domain.User;
import com.wzy.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class TestMybatis {
    private static Logger log = LoggerFactory.getLogger(TestMybatis.class);
    @Autowired
    private UserService userService;
    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @Test
    public void testSpringWithMybatis(){

        User user = userService.getUserById(2);
        log.info(user.toString());
    }

    @After
    public void after() {
        log.info("finished");
        System.out.println("测试结束-----------------");
    }
}
