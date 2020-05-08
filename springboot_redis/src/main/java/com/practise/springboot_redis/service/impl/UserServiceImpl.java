package com.practise.springboot_redis.service.impl;


import com.practise.springboot_redis.domain.User;
import com.practise.springboot_redis.mapper.UserMapper;
import com.practise.springboot_redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int delete(Long id) {
        return userMapper.delete(id);
    }

    @Override
    public User selectOne(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> selectList() {
        return userMapper.selectListUser();
    }

    @Override
    public User update(User user) {
        userMapper.updateUser(user);
        return user;
    }
}
