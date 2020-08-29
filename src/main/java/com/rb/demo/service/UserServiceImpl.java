package com.rb.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rb.demo.entity.User;
import com.rb.demo.mapper.UserMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
