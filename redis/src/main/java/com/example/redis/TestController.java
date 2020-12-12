package com.example.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping("set-key")
    public String testSetKey(@RequestParam("key") String keyString){
        ValueOperations<String,String> opsl = stringRedisTemplate.opsForValue();
        opsl.set(keyString, "value");
        String name=opsl.get(keyString);
        System.out.println(name);
        return name;
    }
}
