package com.practise.springboot_redis.mapper;


import com.practise.springboot_redis.domain.User;
import org.apache.ibatis.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    Logger LOGGER = LoggerFactory.getLogger(UserMapper.class);
    @Insert("insert into user (username,password)values(#{username},#{password})")
    int add(User user);

    @Delete("delete from user where id=#{id}")
    int delete(Long id);

    @Select("select * from user where id = #{id}")
    User selectById(Long id);

    @Select("select * from user")
    List<User> selectListUser();

    @Update("update user set username = #{username},password = #{password} where id =#{id}")
    int updateUser(User user);
}
