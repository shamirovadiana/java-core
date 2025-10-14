package lessons.lesson05.quiz;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        ArrayList<Question> questionList = new ArrayList<>();
        Question question1 = new Question("Сколько будет 7 + 5 ?", "12");
        question1.setAnswers(new String[] {"9", "10", "11", "12"});
        Question question2 = new Question("Чему равно 9 x 3 ?", "27");
        question2.setAnswers(new String[]{"26", "28", "27", "29"});
        Question question3 = new Question("Если разделить 20 на 4, получится...", "5");
        question3.setAnswers(new String[]{"3", "4", "5", "6"});
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);
        ArrayList<Team> teamList = new ArrayList<>();
        Team team1 = new Team("Умножатели");
        Team team2 = new Team("Теорема Победы");
        teamList.add(team1);
        teamList.add(team2);
        Quiz quiz = new Quiz("Матемтическая викторина");
        quiz.setQuestions(questionList);
        quiz.setTeams(teamList);
        quiz.startQuiz();

    }
}
