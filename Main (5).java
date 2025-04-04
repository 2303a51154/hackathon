import java.util.*;

public class Main{
    static Scanner scanner = new Scanner(System.in);

    static class Question {
        String question;
        String[] options;
        int correctOption;

        public Question(String question, String[] options, int correctOption) {
            this.question = question;
            this.options = options;
            this.correctOption = correctOption;
        }

        public boolean ask() {
            System.out.println("\n" + question);
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Enter your choice (1-" + options.length + "): ");
            int userAnswer = scanner.nextInt();
            return userAnswer == correctOption;
        }
    }

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "What does the Preamble of the Indian Constitution emphasize?",
            new String[]{"Religion", "Power", "Justice, Liberty, Equality, and Fraternity", "Monarchy"},
            3
        ));

        questions.add(new Question(
            "Which of the following is a Fundamental Right?",
            new String[]{"Right to Property", "Right to Vote", "Right to Equality", "Right to Work"},
            3
        ));

        questions.add(new Question(
            "Directive Principles are aimed at?",
            new String[]{"Ensuring citizens get punished", "Creating social and economic democracy", "Helping the President", "None"},
            2
        ));

        questions.add(new Question(
            "Which part of the Constitution includes Fundamental Duties?",
            new String[]{"Part IV A", "Part III", "Part V", "Part IX"},
            1
        ));

        System.out.println("Welcome to 'Nagrik Aur Samvidhan' Game!");
        System.out.println("Let’s test your knowledge of the Constitution of India.");

        int score = 0;
        for (Question q : questions) {
            if (q.ask()) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Incorrect.");
            }
        }

        System.out.println("\nYour Score: " + score + "/" + questions.size());
        if (score == questions.size()) {
            System.out.println("🎉 Excellent! You're a true Nagrik!");
        } else if (score >= questions.size() / 2) {
            System.out.println("👍 Good! But you can still learn more.");
        } else {
            System.out.println("📘 Keep learning! The Constitution is for everyone.");
        }
    }
}
