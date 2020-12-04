package com.flydazz.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {

    @GetMapping("/user/search")
    @RequiresPermissions("search")
    public String search() {
        return "search success!";
    }

    @GetMapping("/user/add")
    @RequiresPermissions("add")
    public String add() {
        return "add success!";
    }


}
