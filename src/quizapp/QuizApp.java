package quizapp;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Which language is platform independent?",
                "2. Which keyword is used for inheritance in Java?",
                "3. Which collection allows dynamic size?"
        };

        String[][] options = {
                {"A. C", "B. Java", "C. Assembly", "D. Swift"},
                {"A. implement", "B. extends", "C. inherit", "D. super"},
                {"A. Array", "B. int", "C. ArrayList", "D. double"}
        };

        char[] answers = {'B', 'B', 'C'};

        int score = 0;

        System.out.println("===== JAVA QUIZ APPLICATION =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + answers[i]);
            }
        }

        System.out.println("\nYour Final Score: " + score + "/" + questions.length);

        sc.close();
    }
}