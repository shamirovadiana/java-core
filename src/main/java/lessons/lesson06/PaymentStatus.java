package lessons.lesson06;

public class PaymentStatus {
    private final String status;
    private PaymentStatus(String status){
        this.status = status;
    }
    public static PaymentStatus PAID = new PaymentStatus("Оплачено");
    public static PaymentStatus UNPAID = new PaymentStatus("Не оплачено");
    public String toString(){return status;}
}
