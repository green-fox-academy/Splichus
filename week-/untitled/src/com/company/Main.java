package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime nowFormated = LocalDateTime.parse(LocalDateTime.now().toString(),format);
    }
}
