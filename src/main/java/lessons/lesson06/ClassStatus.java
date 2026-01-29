package lessons.lesson06;

public class ClassStatus {
    private final String status;
    private ClassStatus(String status){
        this.status = status;
    }
    public static ClassStatus BUSINESS = new ClassStatus("Бизнес-класс");
    public static ClassStatus ECONOMY = new ClassStatus("Эконом-класс");
    public String toString(){return status;}
}
