package com.ExamProctor;

import java.util.HashMap;

public class ExamProctorApp {

    public static void main(String[] args) {

        NavigationStack navigation = new NavigationStack();
        AnswerStorage answerStore = new AnswerStorage();

        navigation.visitQuestion(1);
        navigation.visitQuestion(2);
        navigation.visitQuestion(3);

        answerStore.saveAnswer(1, "A");
        answerStore.saveAnswer(2, "B");
        answerStore.saveAnswer(3, "C");

        HashMap<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "D");

        int result = ScoreCalculator.calculateScore(
                answerStore.getAllAnswers(),
                correctAnswers
        );

        System.out.println("Final Score: " + result + "/3");
    }
}
