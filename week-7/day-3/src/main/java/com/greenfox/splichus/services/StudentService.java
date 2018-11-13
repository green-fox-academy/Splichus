package com.greenfox.splichus.services;

import com.greenfox.splichus.models.SavingStudents;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class StudentService implements SavingStudents {
    ArrayList<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }
    public int getCount() {
        return names.size();
    }

    public boolean containsStudent(String name) {
        return names.contains(name);
    }
}
