package com.springapp.mvc.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/port")
public class PortController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(){

        System.out.println("this is port init");

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        return "port";
    }
}
