package com.momo.demo.controller;

import com.momo.demo.dao.UserMapper;
import com.momo.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/selectList")
    private Object selectList(){
        List<User> userList = userMapper.selectList(null);
        return userList;
    }
}
