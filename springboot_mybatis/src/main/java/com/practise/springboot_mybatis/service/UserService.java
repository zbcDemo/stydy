package com.practise.springboot_mybatis.service;

import com.practise.springboot_mybatis.domain.User;

import java.util.List;

public interface UserService {

    int add(User user);

    int delete(Long id);

    User selectOne(Long id);

    List<User> selectList();

    int update(User user);

}
