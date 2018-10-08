package AircraftCarrier;

import java.util.ArrayList;

public class Carrier {

    ArrayList<Aircraft> carrier;
    int ammo;
    int HP;

    Carrier (int ammo, int HP) {
        this.ammo = ammo;
        this.HP = HP;

    }

    void add(Aircraft aircraft) {
        carrier.add(aircraft);
    }

    void fill() {
        if (ammo == 0) {
            System.out.println("There is no more ammo left!");
        } else {
            for (int i = 0; i < carrier.size(); i++) {
               if (carrier.get(i).isPriority()) {
                   ammo-= carrier.get(i).refill(ammo);
               }
            }
            for (int i = 0; i < carrier.size() ; i++) {
                ammo-= carrier.get(i).refill(ammo);
            }
        }
    }
    void fight(Carrier oponent) {
        int dmgTaken = 0;
        int dmgDone = 0;
        for (int i = 0; i < oponent.carrier.size(); i++) {
            dmgTaken+=oponent.carrier.get(i).fight();
        }
        for (int i = 0; i < carrier.size() ; i++) {
            dmgDone+=carrier.get(i).fight();
        }
        oponent.HP = oponent.HP-dmgDone;
        this.HP = this.HP - dmgTaken;
    }
    void getStatus() {
        int totalDmg = 0;
        for (int i = 0; i < carrier.size() ; i++) {
            totalDmg+=(carrier.get(i).baseDmg*carrier.get(i).ammo);
        }
        if (HP > 0) {
            System.out.println("HP: " +HP+ " | Aircraft count: " +carrier.size()+ " | Ammo Storage: " +ammo+ " | Total Damage: " + totalDmg);
            System.out.println("Aircrafts: ");
            for(Aircraft plane : carrier) {
                plane.getStatus();
            }
        }
    }
}
