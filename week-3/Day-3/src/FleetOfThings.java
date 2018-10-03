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

        System.out.println(fleet);
    }
}