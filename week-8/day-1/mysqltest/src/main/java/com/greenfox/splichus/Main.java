package com.greenfox.splichus;

import com.greenfox.splichus.models.Todo;
import com.greenfox.splichus.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    TodoRepo database;

    @Autowired
    public Main(TodoRepo database) {
        this.database = database;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
