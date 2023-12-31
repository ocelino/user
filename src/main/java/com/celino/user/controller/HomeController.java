package com.celino.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/home")
public class HomeController {

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String hello() {
        return "Hello, World";
    }

}
