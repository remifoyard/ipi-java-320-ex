package com.ipiecoles.java.java320.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayHello")
public class HelloController {
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "text/html")
    public String sayHello(){
        String Response = "<html><head>";
        Response+="<title>Hello Servet</title>";
        Response+="</head><body>";
        Response+="<h1>Hello !</h1>";
        Response+="</body></html>";
        return Response;
    }
}
