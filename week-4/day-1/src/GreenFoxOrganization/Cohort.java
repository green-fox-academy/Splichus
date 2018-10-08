package GreenFoxOrganization;

import java.util.ArrayList;

public class Cohort {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Mentor> mentors = new ArrayList<>();

    public Cohort(String name) {
        this.name = name;
    }

    void addStudent (Student student) {
        students.add(student);
    }
    void addMentor (Mentor mentor) {
        mentors.add(mentor);
    }
    void info() {
        System.out.println("The " +name+ " cohort has " +students.size()+ " students and "+mentors.size()+ " mentors.");
    }

}
