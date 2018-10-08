package AircraftCarrier;

public class Aircraft {

    int ammo;
    int maxAmmo;
    int baseDmg;

    Aircraft(int maxAmmo, int baseDmg) {
        this.ammo = 0;
        this.maxAmmo = maxAmmo;
        this.baseDmg = baseDmg;
    }

    int fight () {
        int ammunition = ammo;
        ammo = 0;
        return baseDmg*ammunition;
    }

    int refill (int ammo) {
        int howMuchRefill = this.maxAmmo-this.ammo;
        if (ammo < howMuchRefill){
            this.ammo+=ammo;
            return 0;
        } else {
            this.ammo = this.maxAmmo;
            return ammo-howMuchRefill;
        }
    }

    String getType () {
        if (Aircraft.this instanceof F16) {
            return getClass().getSimpleName();
        }
        return getClass().getSimpleName();
    }

    String getStatus() {
        return "Type: " +getType()+ " | Ammo: " +ammo+ " | Base Damage: " +baseDmg+ " | All damage: " +ammo*baseDmg;
    }

    boolean isPriority() {
        if (Aircraft.this instanceof F35) {
            return true;
        }
        return false;
    }
}
