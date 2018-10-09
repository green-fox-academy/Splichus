package main.java.music;

public abstract class StringedInstrument extends Instrument {

    private int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
    abstract public void sound();

    abstract public void play();
}
