package com.ipiecoles.java.java320.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/sayhello", method = RequestMethod.GET, produces = "text/html")
    public String hello(@RequestParam(value="name", required=false, defaultValue="IPI") String name) {
        String page = "<html><head><title>Hello Servet</title></head><body>";
        page += "<h1>Hello !! " + name + "</h1>";
        page += "</body></html>";
        return page;
    }

}