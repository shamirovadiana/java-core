package lessons.lesson05.learningCenter;

public class Main {
    public static void main(String[] args){
        LearningCenter learningCenter = new LearningCenter();
        String[] schedule1 = {DayOfWeek.MONDAY.toString(), DayOfWeek.THURSDAY.toString(), DayOfWeek.FRIDAY.toString()};
        learningCenter.addNewCourse("12345", Subject.ENGLISH.toString(), schedule1, "Emily Brown", "678398");
        String[] schedule2 = {DayOfWeek.TUESDAY.toString(), DayOfWeek.THURSDAY.toString(), DayOfWeek.SATURDAY.toString()};
        learningCenter.addNewCourse("56789", Subject.MATH.toString(), schedule2, "Chen Wei", "678392");
        learningCenter.getCourseList();
        learningCenter.addNewStudent("Андрей Петров", "54639");
        learningCenter.setScore("54639", Score.FIVE);
    }
}
