package TheGraden;

class Plant {
    protected int waterLevel;
    protected String name;


    Plant(String name) {
        waterLevel = 0;
        this.name = name;
    }

    void watering (double amountOfWater) {
    }

    boolean needsWater () {
        return false;
    }
}
