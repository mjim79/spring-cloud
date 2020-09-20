package com.example.lab4subject.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Value("${words}")
    private String words;

    @GetMapping("/")
    public @ResponseBody String getWord() {
        final String[] wordArray = this.words.split(",");
        final int i = (int)Math.round(Math.random() * (wordArray.length - 1));
        return wordArray[i];
    }

}
