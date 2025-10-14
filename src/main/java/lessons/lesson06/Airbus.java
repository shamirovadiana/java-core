package lessons.lesson06;

import java.util.HashMap;
import java.util.Map;

public class Airbus {
    private final int businessRows = 5;
    private final int businessSeats = 2;
    private final int economyRows = 16;
    private final int economySeats = 3;
    private final Map<Integer, Seat> seats;
    public Airbus(){
        seats = new HashMap<>();
    }
    public void getSeatInfo(int number){
        seats.get(number).getSeatInfo();
    }
    public boolean isAvailable(int number){
        boolean isSeatAvailable = true;
        if(seats.get(number).getReservationStatus().equals(ReservationStatus.RESERVED.toString())){
            isSeatAvailable = false;
        }
        return isSeatAvailable;
    }
    public void bookSeat(int number, String fio, String phoneNumber, String email){
        if(isAvailable(number)) {
            seats.get(number).setPerson(fio, phoneNumber, email);
            seats.get(number).setReservationStatus(ReservationStatus.RESERVED.toString());
        } else {
            System.out.println("Место уже забронировано!");
        }
    }
    public void cancelReservation(int number){
        if(!isAvailable(number)){
            seats.get(number).setPerson("", "", "");
            seats.get(number).setReservationStatus(ReservationStatus.AVAILABLE.toString());
        } else {
            System.out.println("Место уже было свободно!");
        }
    }
    public void getSeatsInfo(){
        for(Integer num : seats.keySet()){
            String classStatus = seats.get(num).getClassStatus();
            String reserveStatus = seats.get(num).getReservationStatus();
            System.out.println(String.format("Номер: %s | %s | %s", num, classStatus, reserveStatus));
        }

    }
    public void setSeatsStatus(){
        int bound = 2 * (businessRows * businessSeats + economyRows * economySeats);
        int businessBound = 2 * businessRows * businessSeats;
        for(int i = 0; i <= bound; i ++){
            if(i <= businessBound){
                seats.put(i, new Seat(i, ClassStatus.BUSINESS.toString()));
            } else {
                seats.put(i, new Seat(i, ClassStatus.ECONOMY.toString()));
            }
        }
    }
}
