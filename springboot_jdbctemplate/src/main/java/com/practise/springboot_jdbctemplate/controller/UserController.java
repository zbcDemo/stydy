package com.practise.springboot_jdbctemplate.controller;

import com.practise.springboot_jdbctemplate.dao.UserDao;
import com.practise.springboot_jdbctemplate.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("users")
    public String selectUser(){
        List<Map<String, Object>> userList = userDao.selectUsers();
        String str = "";
        for (int i = 0; i <userList.size() ; i++) {
            str += userList.get(i);
        }
        return str;
    }
}
