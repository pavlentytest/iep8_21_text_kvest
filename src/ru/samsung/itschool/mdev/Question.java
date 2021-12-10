package ru.samsung.itschool.mdev;

public class Question {
    private String title;
    private Answer[] answers;
    private int correct;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }


}
class Answer {
    private String text;

    public Answer(String text) {
        this.text = text;
    }
}
