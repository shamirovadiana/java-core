package lessons.lesson05.learningCenter;

import lessons.lesson05.learningCenter.Course;

import java.util.ArrayList;

public class Student {
    private String id;
    private String fio;

    private final ArrayList<Course> studentCourses;
    public Student(String fio, String id){
        this.fio = fio;
        this.id = id;
        studentCourses = new ArrayList<>();
    }
    public void getStudentInfo(){
        System.out.println(fio);
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
