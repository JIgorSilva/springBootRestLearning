package br.com.learning.springbootrestlearning.controller;

import br.com.learning.springbootrestlearning.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "HELLO WORLD";
    private final AtomicLong countertId = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name",defaultValue = "World")String name){
        return new Greeting(countertId.incrementAndGet(), String.format(template,name));
    }
}
