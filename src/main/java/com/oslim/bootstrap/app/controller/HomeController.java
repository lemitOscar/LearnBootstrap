package com.oslim.bootstrap.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "alineaciones";
    }

    @GetMapping("/row")
    public String pagerow() {
        return "row-columns";
    }

    @GetMapping("/ani")
    public String anidacion() {
        return "anida";
    }

    @GetMapping("/ver")
    public String ver() {
        return "intentpage/princi";
    }

    @GetMapping("/display")
    public String disp() {
        return "display";
    }
    
    @GetMapping("/mar")
    public String espacio() {
    	return "margin";
    }
    
    @GetMapping("/des")
    public String desbord() {
    	return "desbor";
    }
 
    
}
