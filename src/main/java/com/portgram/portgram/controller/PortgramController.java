package com.portgram.portgram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortgramController {
    
    @GetMapping("/index")
    public String abrirIndex(){
        return "index";
    }
}
