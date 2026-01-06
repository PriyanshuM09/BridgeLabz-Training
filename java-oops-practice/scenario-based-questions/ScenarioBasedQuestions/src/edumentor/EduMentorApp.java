package edumentor;

public class EduMentorApp {
    public static void main(String[] args) {

        Learner learner = new Learner(
                "Priyanshu",
                "priyanshu@gmail.com",
                101,
                true
        );

        String[] questions = {
                "Java supports OOP?",
                "JVM full form?"
        };

        String[] answers = {
                "Yes",
                "Java Virtual Machine"
        };

        Quiz quiz = new Quiz(questions, answers, "Medium");

        String[] userAnswers = {
                "Yes",
                "Java Virtual Machine"
        };

        quiz.evaluateQuiz(userAnswers);
        quiz.showResult();

        learner.generateCertificate();
    }
}

