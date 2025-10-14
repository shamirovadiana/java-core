package lessons.lesson05.learningCenter;

import java.util.HashMap;
import java.util.Map;

public class Course {
    private String id;
    private String subject;
    private Teacher teacher;
    private String[] schedule;
    private final Map<String, Student> students;
    public Course(){
        students = new HashMap<>();
    }
    public Course(String id, String subject, String teacherFio, String teacherId){
        this.id = id;
        this.subject = subject;
        teacher = new Teacher(teacherFio, teacherId);
        students = new HashMap<>();
    }
    public void getStudentsList(){
        for(String id : students.keySet()){
            students.get(id).getStudentInfo();
        }
    }
    public void getTeacherInfo(){
        System.out.println(teacher.getFio());
    }
    public void getCourseInfo(){
        System.out.println(String.format("Предмет: %s | Учитель: %s", subject, teacher.getFio()));
        System.out.println("Расписание: ");
        for(int i = 0; i < schedule.length;i++){
            System.out.print(schedule[i] + " | ");
        }
        System.out.println("\n");
    }

    public void setStudents(String fio, String id){
        Student student = new Student(fio, id);
        students.put(id, student);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(String fio,String teacherId) {
        this.teacher = new Teacher(fio, id);
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }

    public Map<String, Student> getStudents() {
        return students;
    }


}
