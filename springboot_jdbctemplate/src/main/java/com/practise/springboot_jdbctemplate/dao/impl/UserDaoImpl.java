package com.practise.springboot_jdbctemplate.dao.impl;

import com.practise.springboot_jdbctemplate.dao.UserDao;
import com.practise.springboot_jdbctemplate.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int add(User user) {
        String sql = "insert into user (username,password)values(?,?)";
        return jdbcTemplate.update(sql,"zsf","123456");
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public User selectUser(Long id) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectUsers() {
        String sql = "select * from user";
        return jdbcTemplate.queryForList(sql);
    }
}
