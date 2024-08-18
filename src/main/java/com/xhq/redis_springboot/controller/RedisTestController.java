package com.xhq.redis_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：XuHaiqing
 * @Package：com.xhq.redis_springboot.controller
 * @Project：redis_springboot
 * @name：RedisTestController
 * @Date：2024/8/17 22:58
 * @Filename：RedisTestController
 */
@RestController
@RequestMapping("/redisTest")
public class RedisTestController {
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping
    public String testRedis() {
        redisTemplate.opsForValue().set("name", "lucy");
        String s = (String) redisTemplate.opsForValue().get("name");
        System.out.println(s);
        return s;
    }
}
