package com.greenfox.splichus.week9day1.models;

public class Greeter {
    String welcome_message;
    String error;

    public Greeter(String name, String title) {
        if (name == null) {
            error = "Please provide a name!";
        } else if (title == null){
            error = "Please provide a title!";
        } else {
            welcome_message = "Oh, hi there "+name+", my dear "+title+"!";
        }
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public String getError() {
        return error;
    }
}
