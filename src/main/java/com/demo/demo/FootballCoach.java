package com.demo.demo;

import com.demo.demo.interfaces.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballCoach implements Coach {
    @Override
    public String play() {
        return "I am Football Coach";
    }

    @Override
    public String coachName() {
        return "Raj";
    }
}
