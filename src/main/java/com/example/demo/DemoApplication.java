package com.example.demo;

import com.example.demo.entity.User_Info;
import com.example.demo.repo.UserInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class DemoApplication {

    @Autowired
    UserInfoRepo repo;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping
    public String init() {
        User_Info info = new User_Info();
        info.setId("abc");
        info.setPassword("abc");
        repo.save(info);

        long result = repo.count();

        return "Hello : " + result + "건입니다.";
    }

}
