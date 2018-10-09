import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing bed = new Thing("Stand up");
        bed.complete();
        Thing lunch = new Thing("Eat lunch");
        lunch.complete();

        fleet.add(new Thing("Get Milk"));
        fleet.add(new Thing("Remove the obstacles"));
        fleet.add(bed);
        fleet.add(lunch);
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
//        for (int i = 0; i < fleet.things.size(); i++) {
//            for (int j = i+1; j < fleet.things.size(); j++) {
//                if (fleet.things.get(i).compareTo(fleet.things.get(j))>0) {
//                    Collections.swap(fleet.things, i, j);
//                }
//            }
//        }
        for (Thing thing : fleet.things) {
            thing.printAllFields();
        }
        Collections.sort(fleet.things);
        System.out.println(fleet);
    }
}