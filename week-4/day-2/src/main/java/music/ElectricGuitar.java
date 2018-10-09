package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar(){
        this(6);
    }

    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", numberOfStrings);
    }

    @Override
    public void sound() {
        System.out.print("Twang");
    }

    @Override
    public void play() {
        System.out.print(this.name+" a " +this.getNumberOfStrings()+"-stringed instrument that goes ");
        this.sound();
        System.out.println(".");
    }
}
