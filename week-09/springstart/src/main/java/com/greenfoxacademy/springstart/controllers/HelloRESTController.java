package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by almasics on 2016.12.19..
 */
@RestController
public class HelloRESTController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), name);
        return greeting;

    }
}
