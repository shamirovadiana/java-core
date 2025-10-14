package lessons.lesson03;
public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(){}
    public void introduce(){
        System.out.println(String.format("Имя: %s | Возраст: %s", name, age));
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age >= 0) {
            this.age = age;
        }else{
            System.out.println("Ошибка! Возраст не может иметь отрицательное значение!");
        }
    }
}

