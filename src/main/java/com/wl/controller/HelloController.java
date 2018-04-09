package com.wl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by wl on 2018/3/29.
 */

@RestController
@RequestMapping(value = "/api")
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(Principal user){
        return "hello";
    }
}
