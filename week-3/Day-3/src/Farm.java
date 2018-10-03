import java.util.ArrayList;
import java.util.Collections;

public class Farm {

    ArrayList<Animal> allAnimals = new ArrayList<>();
    static int sizeOfFarm = 10;

    public void breed() {
        if(allAnimals.size() <= sizeOfFarm) {
            allAnimals.add(new Animal());
        }
    }
    public void slaugther() {
        for (int i = 0; i < allAnimals.size()-1 ; i++) {
            for (int j = 0; j < allAnimals.size()-1; j++) {
                if(allAnimals.get(j).hunger < allAnimals.get(j+1).hunger) {
                    Animal copyOf = allAnimals.get(j);
                    allAnimals.set(j,allAnimals.get(j+1));
                    allAnimals.set(j+1, copyOf);
                }
            }
        }
        allAnimals.remove(allAnimals.size()-1);
    }


    public static void main(String[] args) {

//        it has list of Animals
//        it has slots which defines the number of free places for animals
//        breed() -> creates a new animal if there's place for it
//        slaughter() -> removes the least hungry animal

        Animal zebra = new Animal("Zebra");
        zebra.eat();
        zebra.eat();
        zebra.eat();
        Animal cat = new Animal("cat");
        cat.play();
        cat.play();
        Animal bear = new Animal("bear");
        bear.eat();
        bear.eat();
        Animal dog = new Animal("dog");
        dog.eat();
        dog.eat();
        dog.eat();
        dog.eat();


        Farm myFarm = new Farm();
        myFarm.allAnimals.add(zebra);
        myFarm.allAnimals.add(cat);
        myFarm.allAnimals.add(bear);
        myFarm.allAnimals.add(dog);

        for (Animal animal : myFarm.allAnimals) {
            System.out.println(animal.name);
            System.out.println(animal.hunger);
        }

        myFarm.slaugther();

        for (Animal animal : myFarm.allAnimals) {
            System.out.println(animal.name);
            System.out.println(animal.hunger);
        }
    }
}
