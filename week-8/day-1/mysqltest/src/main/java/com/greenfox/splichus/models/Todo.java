package com.greenfox.splichus.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    long id;
    String title;
    boolean urgent;
    boolean done;

    public Todo() {
    }

    public Todo(String title) {
        this();
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public Todo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public boolean isDone() {
        return done;
    }

    public String getTitle() {
        return title;
    }
}
