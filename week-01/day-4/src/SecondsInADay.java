public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int passedSeconds = currentHours*3600+currentMinutes*60+42;
        int secondsLeft = 24*3600-passedSeconds;

        System.out.println("There is " +secondsLeft+ " seconds left in the day.");
    }
}