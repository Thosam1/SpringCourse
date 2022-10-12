package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ActivityCoach implements Coach {

    @Autowired
    @Qualifier("activityFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public ActivityCoach() {
        System.out.println(">> PingPongCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your Java Skills and learn Spring";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
