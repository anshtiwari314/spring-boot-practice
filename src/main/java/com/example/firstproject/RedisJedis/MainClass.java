package com.example.firstproject.RedisJedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.RedisClient;

//@SpringBootApplication
public class MainClass {
    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);

        RedisClient jedis = RedisClient.create("redis://:anuj@192.168.1.37:6379/0");
        String res1 = jedis.set("bike:1", "Deimos");
        System.out.println(res1);

    }
}
