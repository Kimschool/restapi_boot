package com.example.demo.controller;

import com.example.demo.entity.User_Info;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
class RestController {

    @GetMapping("/user")
    public User_Info login () {
        User_Info vo = new User_Info();

        String id = "abc";
        String password = "bcd";

        vo.setId(id);
        vo.setPassword(password);

        return vo;

    }
}
