package com.example.fxdspringmybatis.mapper;

import com.example.fxdspringmybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {


    public List<User> userList();







}
