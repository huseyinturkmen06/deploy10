package com.example.heroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/main")
public class Controller {


    @GetMapping("/deneme")
    public String Deneme(){
        return "Merhaba";
    }

    @GetMapping("/deneme2")
    public String Deneme2(){
        return "İsmail";
    }
}
