package lessons.lesson05.learningCenter;

public class Subject {
    private String name;
    private Subject(String name){
        this.name  = name;
    }
    public static Subject ENGLISH = new Subject("Английский язык");
    public static Subject MATH = new Subject("Математика");
    public String toString(){
        return name;
    }
}
