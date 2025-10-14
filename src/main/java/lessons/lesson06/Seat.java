package lessons.lesson06;

import java.time.LocalDate;
import java.time.LocalTime;

public class Seat {
    private Person person;
    private String paymentStatus = PaymentStatus.UNPAID.toString();
    private Booking booking;
    private int number;
    private String classStatus;
    private String reservationStatus = ReservationStatus.AVAILABLE.toString();
    public Seat(int number, String classStatus){
        this.number = number;
        this.classStatus = classStatus;
    }
    public void getSeatInfo(){
        System.out.println(String.format("Номер %s | %s | %s", number, classStatus, reservationStatus));
        System.out.println("Зарезервирован " + booking.getBookingInfo());
    }
    public Person getPerson(){
        return person;
    }
    public void setPerson(String fio, String phoneNumber, String email){
        person = new Person(fio, phoneNumber, email);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getBooking() {
        return booking.getBookingInfo();
    }

    public void setBooking(LocalDate date, LocalTime time) {
        booking = new Booking(date, time);
    }
}
