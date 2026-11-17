package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class AdditionController {

    @GetMapping("/endpoint/MS1/add")
    public String add(@RequestParam int A,
                      @RequestParam int B) {

        return "MS1.1 addition = " + (A + B - 5);
    }
}
