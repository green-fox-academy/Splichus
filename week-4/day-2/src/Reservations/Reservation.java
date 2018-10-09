package Reservations;

public class Reservation implements Reservationy {

    String bookingDow;
    String bookingCode;

    public Reservation(String bookingDow, String bookingCode) {
        this.bookingDow = bookingDow;
        this.bookingCode = bookingCode;
    }

    @Override
    public String getBookingDow() {
        return this.bookingDow;
    }

    @Override
    public String getBookingCode() {
        return this.bookingCode;
    }
}