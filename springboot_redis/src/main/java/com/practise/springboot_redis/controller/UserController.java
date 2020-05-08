package com.practise.springboot_redis.controller;


import com.practise.springboot_redis.domain.User;
import com.practise.springboot_redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("users")
    public String listUser(){
//        User user = userService.selectOne((long) 1);
//        return user.toString();
        List<User> users = userService.selectList();
        String str = "";
        for (int i = 0; i <users.size() ; i++) {
            str += users.get(i).toString()+" ";
        }
        return str;
    }

    @GetMapping("user")
    public String getUser(){
        User user1 = userService.selectOne((long) 1);
        User user2 = userService.selectOne((long) 1);
        user2.setUsername("qazwsx");
        userService.update(user2);
        User user3 = userService.selectOne((long) 1);
        User user4 = userService.selectOne((long) 1);
        return user1.toString()+'\n'+user2.toString();
    }
}
