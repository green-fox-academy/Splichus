package com.greenfox.splichus;

import com.greenfox.splichus.models.MyColor;
import com.greenfox.splichus.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Main implements CommandLineRunner {

    MyColor color;

    @Autowired
    public Main(Printer printer, MyColor color) {
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        color.printColor();
    }
}
