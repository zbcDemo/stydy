package com.practise.cross.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("index")
    public String index () {
        return "index";
    }

    @RequestMapping("hello")
    @CrossOrigin(value = "*")//跨域，*代表所有都可以
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
