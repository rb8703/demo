package com.rb.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rb.demo.entity.User;
import com.rb.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User rb = userService.getOne(new LambdaQueryWrapper<User>().eq(User::getUserName, "rb"));
        System.out.print("用户名"+rb.getUserName());

    }

}
