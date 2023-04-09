package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizRequest {
         String first;
         String second;

@RequestMapping("/add/first/{first}/second/{second}")
    public String getFirst(@PathVariable String first,@PathVariable String second){
    int result = Integer.parseInt(second) + Integer.parseInt(first);

        return String.valueOf(result);
    }

}
