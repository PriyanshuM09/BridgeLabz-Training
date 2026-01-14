package com.ExamProctor;

import java.util.HashMap;

public class ScoreCalculator {

    public static int calculateScore(HashMap<Integer, String> studentAnswers, HashMap<Integer, String> correctAnswers) {
        int score = 0;
        for (int qId : correctAnswers.keySet()) {
            if (studentAnswers.containsKey(qId)) {
                if (studentAnswers.get(qId).equalsIgnoreCase(correctAnswers.get(qId))) {
                  score++;
             }
            } }
        return score;
    }
}

