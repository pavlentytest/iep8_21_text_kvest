package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private String name;
    private ArrayList<Question> questionArrayList;
    private Scanner scanner;

    public Game(String name, ArrayList<Question> questionArrayList) {
        this.name = name;
        this.questionArrayList = questionArrayList;
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Приветствуем вас!");
        System.out.println("Для ответа укажите вариант ответа!");

        for(Question q: questionArrayList) {
            System.out.println("Вопрос: " + q.getTitle());
            System.out.println("Ответы: ");
            for(Answer a: q.getAnswers()) {
                System.out.print(a);
            }
            System.out.println(" ------------------------------- ");
            int x = scanner.nextInt();
            if((x-1) == q.getCorrect()) {
                Rating.counter++;
            }
        }
        if(Rating.counter > 10) {
            System.out.println("Вы победитель! Поздравляем вас!");
        } else {
            System.out.println("Давай до свидания!");
        }
    }
}
