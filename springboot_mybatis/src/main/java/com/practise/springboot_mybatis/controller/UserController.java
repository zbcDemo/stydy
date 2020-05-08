package com.practise.springboot_mybatis.controller;

import com.practise.springboot_mybatis.domain.User;
import com.practise.springboot_mybatis.service.UserService;
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
}
