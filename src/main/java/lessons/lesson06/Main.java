package lessons.lesson06;

public class Main {
    public static void main(String[] args){
        Airbus airbus = new Airbus();
        airbus.setSeatsStatus();
        airbus.getSeatsInfo();
        airbus.bookSeat(20, "Fio", "Phone", "Email");
        airbus.getSeatInfo(20);
        airbus.cancelReservation(20);
        airbus.getSeatInfo(20);

    }
}
