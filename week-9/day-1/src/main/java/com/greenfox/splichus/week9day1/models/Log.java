package com.greenfox.splichus.week9day1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Log {

    @Id
    @GeneratedValue
    Long id;
    LocalDateTime createdAt;
    String endpoint;
    String data;

    public Log() {
    }

    public Log(LocalDateTime createdAt, String endpoint, String data) {
        this.createdAt = createdAt;
        this.endpoint = endpoint;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getData() {
        return data;
    }
}
