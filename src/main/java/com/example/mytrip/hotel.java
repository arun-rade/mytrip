package com.example.mytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {
    @GetMapping("/train")
    public String getData() {return  "Please  book hotels with 50% discount" ; }
}
