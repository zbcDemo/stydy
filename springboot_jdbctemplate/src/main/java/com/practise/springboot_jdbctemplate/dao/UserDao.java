package com.practise.springboot_jdbctemplate.dao;

import com.practise.springboot_jdbctemplate.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    int add(User user);

    int delete(Long id);

    User selectUser(Long id);

    List<Map<String, Object>> selectUsers();
}
