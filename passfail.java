/*(Pass or fail) Write a program that prompts a student to enter a Java score. If the
score is greater or equal to 60, display “you pass the exam”; otherwise, display “you
don’t pass the exam”. Your program ends with input -1. */

import java.util.Scanner;

public class passfail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;

        // Loop until the user enters -1
        while (true) {
            // Prompt the student to enter a score
            System.out.print("Enter your Java score (or -1 to end): ");
            score = input.nextInt();

            // Check if the user wants to exit
            if (score == -1) {
                System.out.println("Program ended.");
                break;
            }

            // Determine if the score is passing or failing
            if (score >= 60) {
                System.out.println("You pass the exam.");
            } else {
                System.out.println("You don’t pass the exam.");
            }
        }

        input.close();
    }
}
