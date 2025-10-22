package lessons.lesson06;

public class ReservationStatus {
    private final String status;
    private ReservationStatus(String status){
        this.status = status;
    }
    public static ReservationStatus AVAILABLE = new ReservationStatus("Свободное");
    public static ReservationStatus RESERVED = new ReservationStatus("Забронированное");
    public String toString(){return status;}
}
