package com.demo.demo;

import com.demo.demo.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String play() {
        return "I am Football Coach";
    }
}
