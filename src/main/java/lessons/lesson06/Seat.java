package lessons.lesson06;

public class Seat {
    private Person person;
    private int number;
    private String classStatus;
    private String reservationStatus = ReservationStatus.AVAILABLE.toString();
    public Seat(int number, String classStatus){
        this.number = number;
        this.classStatus = classStatus;
    }
    public void getSeatInfo(){
        System.out.println(String.format("Номер %s | %s | %s", number, classStatus, reservationStatus));
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
}
