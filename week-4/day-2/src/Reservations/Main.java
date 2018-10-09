package Reservations;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Reservation x = new Reservation(getRandomDow(), getRandomCode());
            System.out.println("Booking# " + x.getBookingCode() + " for " + x.getBookingDow());
        }
    }

    public static String getRandomDow() {
        ArrayList<String> listOfDows = new ArrayList<>();
        listOfDows.add("MON");
        listOfDows.add("TUE");
        listOfDows.add("WED");
        listOfDows.add("THU");
        listOfDows.add("FRI");
        listOfDows.add("SAT");
        listOfDows.add("SUN");
        return listOfDows.get((int) (Math.random() * 7));
    }

    public static char getRandomChar() {
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 48; i <= 57; i++) {
            chars.add(Character.valueOf((char) i));
        }
        for (int j = 65; j <= 90; j++) {
            chars.add(Character.valueOf((char) j));
        }
        return chars.get((int) (Math.random() * 36));
    }

    public static String getRandomCode() {
        String code = "";
        for (int i = 0; i < 8; i++) {
            code += getRandomChar();
        }
        return code;
    }

}