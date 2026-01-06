package edumentor;

public class Quiz {

    private String[] questions;        
    private final String[] answers;    
    public int score;
    public String difficulty;

    // Constructor with difficulty
    public Quiz(String[] questions, String[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
    }

    public void evaluateQuiz(String[] userAnswers) {
        score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / questions.length;
    }

    public void showResult() {
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}
