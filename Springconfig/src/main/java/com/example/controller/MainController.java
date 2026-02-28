package com.example.controller;//package com.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {


        @RequestMapping(value = "/")
        public String home() {
            //ystem.out.println("HomeController: Passing through...");
            return "index";
        }
    }

