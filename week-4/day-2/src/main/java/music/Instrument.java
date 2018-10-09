package main.java.music;

public abstract class Instrument {
    String name;

    public Instrument (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void play ();
}
