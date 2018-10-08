package TheGraden;

public class Flower extends Plant {

    public Flower(String name) {
        super(name);
    }
    @Override
    void watering (double amountOfWater) {
        super.waterLevel+=3*amountOfWater/4;
    }

    @Override
    boolean needsWater() {
        if (waterLevel<5) {
            return true;
        }
        return false;
    }
}
