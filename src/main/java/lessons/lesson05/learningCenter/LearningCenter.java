package lessons.lesson05.learningCenter;

import java.util.HashMap;
import java.util.Map;

public class LearningCenter {
    private final Map<String, Student> students;
    private final Map<String, Teacher> teachers;
    private final Map<String, Course> courses;
    private final Map<String, Score> scores;

    public LearningCenter(){
        students = new HashMap<>();
        teachers = new HashMap<>();
        courses = new HashMap<>();
        scores = new HashMap<>();
    }
    public void addNewCourse(String id, String subject, String[] schedule, String teacherFio, String teacherId){
        Course course = new Course(id, subject, teacherFio, teacherId);
        course.setSchedule(schedule);
        courses.put(id, course);
    }
    public void setScore(String studentId, Score score){
        scores.put(studentId, score);
        System.out.println(String.format("%s : %s", students.get(studentId).getFio(), score.toString()));
    }
    public void removeCourse(String id){
        courses.remove(id);
    }
    public void getCourseList(){
        for (String id : courses.keySet()){
            courses.get(id).getCourseInfo();
        }
    }
    public void addNewStudent(String fio, String id){
        Student student = new Student(fio, id);
        students.put(id, student);
    }
    public void removeStudent(String id){
        students.remove(id);
    }

    public void addNewTeacher(String fio, String id){
        Teacher teacher = new Teacher(fio, id);
        teachers.put(id, teacher);
    }
    public void removeTeacher(String id){
        teachers.remove(id);
    }
}