package com.example.generatorutil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.generatorutil.dao.UserCopyMapper;
import com.example.generatorutil.model.UserCopy;
import com.example.generatorutil.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public String save(UserCopy user){
    	userService.insert(user);
        return "保存成功";
    }
    @PostMapping("/mutiSave")
    public String mutiSave(){
    	UserCopy user = new UserCopy();
    	user.setPassword("123");
    	user.setUsername("mutiUserName");
    	userService.insert(user);
        return "保存成功"+user.getId();
    }
    @GetMapping("/select1/{id}")
    public UserCopy select(@PathVariable("id") int id){
        return userService.select(id);
    }
}

