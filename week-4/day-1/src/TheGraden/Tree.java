package TheGraden;

public class Tree extends Plant {

    public Tree(String name) {
        super(name);
    }
    @Override
    void watering (double amountOfWater) {
        super.waterLevel+=4*amountOfWater/10;
    }

    @Override
    boolean needsWater () {
        if (super.waterLevel < 10) {
            return true;
        } else {
            return false;
        }
    }
}
