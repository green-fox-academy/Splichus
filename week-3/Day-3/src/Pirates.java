public class Pirates {

    int intoxication = 0;
    boolean dead;
    String name;

    public Pirates (String name){
        this.name = name;
    }

    public void drinkSomeRum() {
        if (!dead) {
            intoxication++;
        } else {
            pirateDead();
        }
    }
    public void howIsItGoingMate() {
        if (!dead) {
            if (intoxication <=4) {
                System.out.println("Pour me anudder!");
                drinkSomeRum();
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                passOut();
            }
        } else {
            pirateDead();
        }
    }

    public void die () {dead = true;}

    public void brawl (Pirates oponent) {
        double roll = Math.random();
        if (!oponent.dead) {
            if (!dead) {
                if (roll < 0.33) {
                    die();
                    System.out.println(name + " lost and died in the brawl");
                } else if (roll > 0.33 && roll < 0.66) {
                    oponent.die();
                    System.out.println(oponent.name + " lost and died in the brawl");
                } else {
                    passOut();
                    oponent.passOut();
                    System.out.println("No fight happened both " +name+ " and " +oponent.name+ " passed out");
                }
            } else {
                pirateDead();
            }
        } else {
            System.out.println("How do you fight a dead oponent?? Choose a differnt one!");
        }
    }
    public void pirateDead () {System.out.println(name+" is dead");}

    public void passOut () {

        intoxication = 0;
    }

    public static void main(String[] args) {
//        Create a Pirate class. While you can add other fields and methods, you must have these methods:-
//              drinkSomeRum() - intoxicates the Pirate some
//              howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
//                  0 to 4 times, "Pour me anudder!"
//                  else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//        If you manage to get this far, then you can try to do the following.
//            die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//            brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
//
//        And... if you get that far...
//        Add a parrot.

        Pirates blackeye = new Pirates("Blackeye");
        Pirates randy = new Pirates("Randy");
        Pirates dandy = new Pirates("Dandy");

        blackeye.die();
        dandy.brawl(randy);



    }
}
