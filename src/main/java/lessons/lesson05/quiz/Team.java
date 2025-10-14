package lessons.lesson05.quiz;

public class Team {
    private String name;
    private int result = 0;
    public Team(String name){
        this.name = name;
    }

    public void addPoint(){
        result += 1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
