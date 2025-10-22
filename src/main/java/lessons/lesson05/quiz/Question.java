package lessons.lesson05.quiz;

import java.util.ArrayList;

public class Question {
    private String text;
    private String[] answers;
    private String rightAnswer;
    public Question(String text, String rightAnswer){
        this.text = text;
        this.rightAnswer = rightAnswer;
        answers = new String[4];
    }

    public void printQuestion(){
        System.out.println(text);
        for(String answer: answers){
            System.out.print(answer + " ");
        }
        System.out.println("\n");
    }
    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}
