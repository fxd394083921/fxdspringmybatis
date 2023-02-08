package com.example.fxdspringmybatis.service;

import com.example.fxdspringmybatis.bean.User;
import com.example.fxdspringmybatis.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public List<User> userList(){
        return userMapper.userList();
    }



}
