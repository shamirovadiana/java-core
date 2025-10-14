package lessons.lesson05.learningCenter;

import lessons.lesson05.learningCenter.Course;

import java.util.ArrayList;

public class Teacher {
    private String id;
    private String fio;
    private final ArrayList<Course> teacherCourses;
    public Teacher (String fio, String id){
        this.fio = fio;
        this.id = id;
        teacherCourses = new ArrayList<>();
    }
    public void getTeacherInfo(){
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
