package com.waiteryang.springk8sdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangli
 */
@RequestMapping(value = "/v1/")
@RestController
public class HomeController {

    @GetMapping(value = "/test")
    public String test() {
        return "我是测试呀";
    }
}
