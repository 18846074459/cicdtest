package com.wxd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className：cicdtest
 * @description：TODO
 * @datetime：2020/12/15 14:22
 * @author：wxd
 */
@RestController
public class UserController {

    @RequestMapping("/user")
    private String user(){
        return "Hello world.............";
    }
}
