package TheGraden;

public class Main {

    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.add(new Flower("yellow"));
        garden.add(new Flower("blue"));
        garden.add(new Tree("purple"));
        garden.add(new Tree("orange"));

        garden.watering(40);
        garden.watering(70);

    }
}
