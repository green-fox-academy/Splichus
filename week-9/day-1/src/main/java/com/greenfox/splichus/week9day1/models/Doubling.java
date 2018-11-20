package com.greenfox.splichus.week9day1.models;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Doubling {
    Integer received;
    Integer result;
    String error;

    public Doubling(Integer received) {

        if (received == null) {
            error = "Please provide an input!";

        } else {
            this.received = received;
            this.result = 2*received;
        }
    }

    public Integer getReceived() {
        return received;
    }

    public Integer getResult() {
        return result;
    }

    public String getError() {
        return error;
    }
}
