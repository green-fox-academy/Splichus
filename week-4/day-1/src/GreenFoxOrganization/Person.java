package GreenFoxOrganization;

public class Person {
    String name;
    int age;
    String gender;

    Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    Person(String name, int age, String gender) {
        this.name = name;
        this.age= age;
        this.gender = gender;
    }

    String introduce() {
        String toReturn = "Hi, I'm " +name+ " a " +age+ " year old "+gender;
        System.out.println(toReturn+".");
        return toReturn;
    }

    void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

}
