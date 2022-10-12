package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component // Spring will automatically register this components
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

}
