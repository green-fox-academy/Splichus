package main.java.music;

public class Violin extends StringedInstrument{

    public Violin() {
        this(4);
    }

    public Violin(int numberOfStrings) {
        super("Violin", numberOfStrings);
    }

    @Override
    public void sound() {
        System.out.print("Screech");
    }

    @Override
    public void play() {
        System.out.print(this.name+" a " +this.getNumberOfStrings()+"-stringed instrument that goes ");
        this.sound();
        System.out.println(".");
    }
}
