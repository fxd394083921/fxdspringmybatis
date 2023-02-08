package com.example.fxdspringmybatis.task;

import com.example.fxdspringmybatis.bean.User;
import com.example.fxdspringmybatis.service.UserService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

@Component
public class UserTask {


    @Resource
    UserService userService;

    @Scheduled(cron ="0/30 * * * * ?")
    public void doUser(){
        System.out.println( "UserTask begin。。。。  " );
        List<User> users = userService.userList();
        System.out.println(users );

    }

}
