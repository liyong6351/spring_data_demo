package com.liyong.demo.jdbc_test.controller;

import com.liyong.demo.jdbc_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> author liyong  </p>
 * <p> date 2019-03-18 20:45 </p>
 * <p> description  </p>
 **/
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/user/{id}")
    public Object getUser(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }
}
