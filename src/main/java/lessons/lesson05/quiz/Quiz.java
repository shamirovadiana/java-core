package lessons.lesson05.quiz;

import java.util.ArrayList;
import java.util.Scanner;



public class Quiz {
    private String name;
    private ArrayList<Question> questions;
    private ArrayList<Team> teams;
    public Quiz(String name){
        this.name = name;
        questions = new ArrayList<>();
        teams = new ArrayList<>();
    }
    public void setQuestions(ArrayList<Question> questions){
        this.questions.addAll(questions);
    }
    public void setTeams(ArrayList<Team> teams){
        this.teams.addAll(teams);
    }
    public boolean isCorrectAnswer(Question question, String answer){
        boolean isCorrect = false;
        if(answer.equals(question.getRightAnswer())){
            isCorrect = true;
        }
        return isCorrect;
    }
    public void isWinner(){
        ArrayList<Integer> results = new ArrayList<>();
        for (Team team : teams){
            results.add(team.getResult());
            System.out.println(String.format("Команда '%s' | Количество очков '%s'", team.getName(), team.getResult()));
        }
    }
    public void startQuiz(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("Квиз '%s' начинается!",name));
        for(Question q : questions){
            q.printQuestion();
            for(Team team : teams){
                String answer = "";
                System.out.println(String.format("Команда '%s' введите свой ответ", team.getName()));
                answer = scanner.nextLine();
                if(isCorrectAnswer(q, answer)){
                    team.addPoint();
                }
            }
        }
        isWinner();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
