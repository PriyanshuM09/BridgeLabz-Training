package com.ExamProctor;

import java.util.HashMap;

public class AnswerStorage {

    private HashMap<Integer, String> answers;

    public AnswerStorage() {
        answers = new HashMap<>();
    }

    public void saveAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Q" + questionId);
    }

    public HashMap<Integer, String> getAllAnswers() {
        return answers;
    }
}

