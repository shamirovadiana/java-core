package lessons.lesson03;

public class Car {
    private String country;
    private String model;
    private int yearOfManufacture;
    public Car(String country, String model, int yearOfManufacture){
        this.country = country;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }
    public Car(){}
    public void printCarInfo(){
        System.out.println(String.format("Страна производства: %s | Модель: %s | Год производства: %s", country, model, yearOfManufacture));
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYearOfManufacture(){
        return yearOfManufacture;
    }
    public void setYearOfManufacture(int yearOfManufacture){
        if(yearOfManufacture > 0){
            this.yearOfManufacture = yearOfManufacture;
        }
    }
}

