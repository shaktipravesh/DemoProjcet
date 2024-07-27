package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        String str = "<html><body><font color=\"green\">" +
                "<h1> Welcome Shakti</h1> +" +
                "</font></body></html>";
        return str;
    }

    @RequestMapping(method = {RequestMethod.GET}, value = {"/shakti"})
    public String info(){
        String str2 = "<html><body><font color=\"green\">" +
                "<h2> Welcome Shakti Once again</h2> +" +
                "</font></body></html>";
        return str2;
    }
}
