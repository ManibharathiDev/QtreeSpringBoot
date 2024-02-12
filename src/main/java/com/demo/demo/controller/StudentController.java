package com.demo.demo.controller;

import com.demo.demo.CricketCoach;
import com.demo.demo.FootballCoach;
import com.demo.demo.interfaces.Coach;
import com.demo.demo.model.Staff;
import com.demo.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private Coach coach;
    StudentController(FootballCoach coach)
    {
        this.coach = coach;
    }

    @GetMapping("/play")
    public String getCoach()
    {
        return this.coach.play();
    }

    /*private CricketCoach cricketCoach;
    private FootballCoach footballCoach;
    */


    /*@Autowired
    StudentController(CricketCoach cricketCoach, FootballCoach footballCoach)
    {
        this.cricketCoach = cricketCoach;
        this.footballCoach = footballCoach;
    }

    @GetMapping("/play_cricket")
    public String getCoach(){
        return this.cricketCoach.play();
    }

    @GetMapping("/play_football")
    public String getFootball()
    {
        return this.footballCoach.play();
    }

     */

}
