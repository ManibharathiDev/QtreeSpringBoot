package com.demo.demo;

import com.demo.demo.interfaces.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String play() {
        return "I am cricket coach";
    }
}
