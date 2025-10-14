package lessons.lesson05.learningCenter;

public class Score {
    private String score;
    private String description;
    private Score(String score, String description){
        this.score = score;
        this.description = description;
    }

    public static Score ONE = new Score("1", "Очень плохо");
    public static Score TWO = new Score("2","Неудовлетворительно");
    public static Score THREE = new Score("3", "Удовлетворительно");
    public static Score FOUR = new Score("4", "Хорошо");
    public static Score FIVE = new Score("5", "Отлично");

    public String toString(){
        return "Оценка = " + score + "(" + description + ")";
    }
}
