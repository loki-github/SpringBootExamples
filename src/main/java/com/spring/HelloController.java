package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MyApp")
public class HelloController {
        @GetMapping("/hello-world")
        public Greeting sayHello(){
            return new Greeting(1, "hello loki");
        }
}
