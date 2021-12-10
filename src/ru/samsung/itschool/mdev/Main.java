package ru.samsung.itschool.mdev;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Игра в города
        // Игра (Game)
        // Вопрос (Question)
        // Ответ (Answer)
        // Рейтинг (Rating)
        Question question1 = new Question();
        question1.setTitle("Столица России?");
        Answer[] answers1 = {
                new Answer("1 - Москва"),
                new Answer("2 - Казань"),
                new Answer("3 - Санкт-Петербург") };
        question1.setAnswers(answers1);
        question1.setCorrect(0);

        Question question2 = new Question();
        question2.setTitle("Столица Германии?");
        Answer[] answers2 = {
                new Answer("1 - Мюнхен"),
                new Answer("2 - Берлин"),
                new Answer("3 - Гамбург"),
                new Answer("4 - Нюрнберг")};
        question2.setAnswers(answers2);
        question2.setCorrect(1);

        ArrayList<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);

        Game game = new Game("Играем в города", questions);
        game.start();


    }
}
