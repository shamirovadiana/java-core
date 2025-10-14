package lessons.lesson06;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    private LocalDate date;
    private LocalTime time;
    public Booking(LocalDate date, LocalTime time){
        this.date = date;
        this.time = time;
    }
    public String getBookingInfo(){
        return "Дата: " + date + " Время: " + time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
