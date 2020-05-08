package com.practise.springboot_redis;

import com.practise.springboot_redis.domain.User;
import com.practise.springboot_redis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.security.RunAs;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringTest.class)
public class SpringTest {
    @Autowired
    private UserService userService;
    @Test
    public void test(){
        User user1 = userService.selectOne((long) 1);
        User user2 = userService.selectOne((long) 1);
    }
}
