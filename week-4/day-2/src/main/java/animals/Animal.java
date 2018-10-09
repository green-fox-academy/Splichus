package main.java.animals;

public abstract class Animal {
    private int age;
    private String name;
    private int height;
    private String color;
    private boolean isAlive;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public String breed();
}
