package com.rb.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rb.demo.entity.User;
import com.rb.demo.mapper.UserMapper;
import com.rb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class demoController {

    @Autowired
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public String index() {

        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<User>();
        queryWrapper.eq(User::getUserName,"rb");
        User user = userMapper.selectOne(queryWrapper);

        User one = userService.getOne(queryWrapper);

        return user.toString();
    }


}
