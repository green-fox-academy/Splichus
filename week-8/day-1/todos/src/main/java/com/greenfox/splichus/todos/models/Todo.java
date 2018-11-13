package com.greenfox.splichus.todos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    long id;
    String title;
    boolean urgent = false;
    boolean done = false;

    public Todo() {
    }

    public Todo(String title) {
        this();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
