package com.greenfox.splichus.services;

import com.greenfox.splichus.models.SavingStudents;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class StudentServiceTxt implements SavingStudents {
    List<String> names;

    public StudentServiceTxt() {
        try {
            names = Files.readAllLines(Paths.get("database.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> findAll() {
        return names;
    }

    @Override
    public void save(String student) {
        names.add(student);
        try {
            Files.write(Paths.get("database.txt"), names);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public boolean containsStudent(String name) {
        return names.contains(name);
    }
}
