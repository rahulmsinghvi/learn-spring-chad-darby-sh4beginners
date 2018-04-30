package com.udemy.spring.demo;

public class MyApp {
    public static void main(String[] s){
        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}