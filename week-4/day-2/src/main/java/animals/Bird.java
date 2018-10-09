
package main.java.animals;

public class Bird extends Animal implements Flyable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "by laying eggs.";
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }
}
