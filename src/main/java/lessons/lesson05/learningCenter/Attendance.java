package lessons.lesson05.learningCenter;

import java.util.HashMap;
import java.util.Map;

public class Attendance {
    private final Map<String, String> attendanceJournal;
    public Attendance(){
        attendanceJournal = new HashMap<>();
    }
    public void isAbsent(String id){
        attendanceJournal.put(id, "absent");
    }
    public void isPresent(String id){
        attendanceJournal.put(id, "present");
    }

}
