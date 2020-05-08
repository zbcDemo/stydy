package com.practise.springboot_mybatis.service.impl;

import com.practise.springboot_mybatis.domain.User;
import com.practise.springboot_mybatis.mapper.UserMapper;
import com.practise.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
    public int update(User user) {
        return userMapper.updateUser(user);
    }
}
