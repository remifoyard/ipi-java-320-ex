package com.ipiecoles.java.java320.Controller;

import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.MediaPrintableArea;
import java.awt.*;

@RestController
@RequestMapping("/sayHello")
public class HelloController {
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "text/html")
    public String sayHello1(){
        String Response = "<html><head>";
        Response+="<title>Hello Servet</title>";
        Response+="</head><body>";
        Response+="<h1>Hello !</h1>";
        Response+="</body></html>";
        return Response;
    }


    @RequestMapping(value = "", method = RequestMethod.GET, produces = "text/html", params = {"nom","prenom"} )
    public String sayHello2(@RequestParam("nom") String nom,@RequestParam("prenom") String prenom){
        String Response = "<html><head>";
        Response+="<title>Hello Servet</title>";
        Response+="</head><body>";
        Response+="<h1>Hello " + nom + " " + prenom + " !</h1>";
        Response+="</body></html>";
        return Response;
    }

    @RequestMapping(value = "/{name}/{firstname}", method = RequestMethod.GET, produces = "text/html" )
    public String sayHello3(@PathVariable(value = "name") String name,@PathVariable(value = "firstname") String firstname){
        String Response = "<html><head>";
        Response+="<title>Hello Servet</title>";
        Response+="</head><body>";
        Response+="<h1>Hello " + name + " " + firstname + "  !</h1>";
        Response+="</body></html>";
        return Response;
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = "text/html", consumes = "application/json" )
    public String sayHello4(@RequestBody UserStats userStats){
        String Response = "<html><head>";
        Response+="<title>Hello Servet</title>";
        Response+="</head><body>";
        Response+="<h1>Hello " + userStats.getLastName() + " " + userStats.getFirstName() + " !</h1><h2>" + userStats.getTel() + "</h2><h3>" + userStats.getMail() + "</h3>";
        Response+="</body></html>";
        return Response;
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.TEXT_HTML_VALUE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String sayHello5(@RequestBody MultiValueMap<String,String> map){
        String Response = "<html><head>";
        Response+="<title>Hello Servet</title>";
        Response+="</head><body>";
        Response+="<h1>Hello " + map.getFirst("nom") + "</h3>";
        Response+="</body></html>";
        return Response;
    }
}
