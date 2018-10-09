package main.java.music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar() {
        this(4);
    }

    public BassGuitar(int numberOfStrings) {
        super("BassGuitar", numberOfStrings);
    }

    @Override
    public void sound() {
        System.out.print("Duum-duum-duum");
    }

    @Override
    public void play() {
        System.out.print(this.name+" a " +this.getNumberOfStrings()+"-stringed instrument that goes ");
        this.sound();
        System.out.println(".");
    }
}
