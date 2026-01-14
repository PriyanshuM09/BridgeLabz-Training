package com.ExamProctor;

import java.util.Stack;

public class NavigationStack {

    private Stack<Integer> questionStack;

    public NavigationStack() {
        questionStack = new Stack<>();
    }

    public void visitQuestion(int questionId) {
        questionStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public int goBack() {
        if (questionStack.isEmpty()) {
            System.out.println("No previous question.");
            return -1;
        }
        return questionStack.pop();
    }

    public void showHistory() {
        System.out.println("Navigation History: " + questionStack);
    }
}
