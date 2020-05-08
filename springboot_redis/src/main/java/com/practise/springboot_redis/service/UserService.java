package com.practise.springboot_redis.service;



import com.practise.springboot_redis.domain.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;
@CacheConfig(cacheNames = "user")
@Repository
public interface UserService {

    int add(User user);

    @CacheEvict(key = "#p0",allEntries = true)
    int delete(Long id);

    @Cacheable(key = "#p0")
    User selectOne(Long id);

    List<User> selectList();

    @CachePut(key = "#p0.id")
    User update(User user);

}
