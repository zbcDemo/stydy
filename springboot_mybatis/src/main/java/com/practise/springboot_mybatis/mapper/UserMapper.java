package com.practise.springboot_mybatis.mapper;

import com.practise.springboot_mybatis.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

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
