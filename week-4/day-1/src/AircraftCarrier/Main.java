package AircraftCarrier;

public class Main {
    public static void main(String[] args) {
        Carrier muj = new Carrier(5000, 5000);
        muj.add(new F16());
        muj.add(new F35());
        muj.add(new F35());

        Carrier cizi = new Carrier(5000, 5000);
    }
}
