package com.example.lab3client.luckyword;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class LuckyWordController {

    @Value("${lucky-word}")
    String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return "The lucky word is: " + this.luckyWord;
    }

}
