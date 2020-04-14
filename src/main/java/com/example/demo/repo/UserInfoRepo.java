package com.example.demo.repo;

import com.example.demo.entity.User_Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepo extends JpaRepository<User_Info, Long> {


}
