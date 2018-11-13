package com.greenfox.splichus.models;

import java.util.List;

public interface SavingStudents {

    public List<String> findAll();
    public void save(String student);
    public int getCount();
    public boolean containsStudent(String name);

}
