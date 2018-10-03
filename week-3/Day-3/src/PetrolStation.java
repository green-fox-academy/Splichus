class Station {
    int gasAmount;

    public void refill (Car car) {
        gasAmount -= (car.capacity - car.gasAmount);
    }
}

class Car {
    int gasAmount;
    int capacity;

    public Car() {
        gasAmount = 0;
        capacity = 100;
    }
}

public class PetrolStation {

    public static void main(String[] args) {
//        Create Station and Car classes
//        Station
//          gasAmount
//          refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//        Car
//          gasAmount
//          capacity
//          create constructor for Car where:
//              initialize gasAmount -> 0
//              initialize capacity -> 100
        Station mol = new Station();
        mol.gasAmount = 200;
        Car ford = new Car();
        mol.refill(ford);
        System.out.println(mol.gasAmount);
    }
}
