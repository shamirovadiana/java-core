package lessons.lesson06;

public class Person {
    private String fio;
    private String phoneNumber;
    private String email;
    public Person(String fio, String phoneNumber, String email){
        this.fio = fio;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
