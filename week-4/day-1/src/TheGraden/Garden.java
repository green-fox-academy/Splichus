package TheGraden;

import java.util.ArrayList;

public class Garden {
    ArrayList<Plant> plants = new ArrayList<>();

    public Garden() {
    }

    void add (Plant plant) {
        plants.add(plant);
    }

    void
    watering (int amountOfWater) {

        System.out.println("Watering with " +amountOfWater);
        int flowersWhichNeedsWater = 0;
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).needsWater()) {
                flowersWhichNeedsWater++;
            }
        }
        for (int i = 0; i < plants.size() ; i++) {
            if (plants.get(i) instanceof Flower) {
                if (!plants.get(i).needsWater()) {
                    System.out.println("The "+plants.get(i).name+" Flower doesn't need water");
                } else {
                    plants.get(i).watering(amountOfWater/(double)flowersWhichNeedsWater);
                    if (plants.get(i).needsWater()) {
                        System.out.println("The "+plants.get(i).name+" Flower needs water");
                    } else {
                        System.out.println("The "+plants.get(i).name+" Flower doesn't need water");
                    }
                }
            } else {
                if (!plants.get(i).needsWater()) {
                    System.out.println("The "+plants.get(i).name+" Tree doesn't need water");
                } else {
                    plants.get(i).watering(amountOfWater/(double)flowersWhichNeedsWater);
                    if (plants.get(i).needsWater()) {
                        System.out.println("The "+plants.get(i).name+" Tree needs water");
                    } else {
                        System.out.println("The "+plants.get(i).name+" Tree doesn't need water");
                    }
                }
            }
        }
    }
}
