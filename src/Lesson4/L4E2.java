package Lesson4;

import java.util.Scanner;

public class L4E2 {
    public static void main(String[] args) {
        Scanner Question1 = new Scanner(System.in);
        System.out.println("What is the capital of Nigeria?");
        String Q1 = Question1.nextLine();
        if (Q1.toLowerCase().equals("lagos")) {
            System.out.println("Sorry, the correct answer is Lagos");
        }


        Scanner Question2 = new Scanner(System.in);
        System.out.println("What is the capital of the Uk?");
        String Q2 = Question2.nextLine();
        if (Q2.toLowerCase().equals("london")) {
            System.out.println("Sorry, the correct answer is London");
        }

        Scanner Question3 = new Scanner(System.in);
        System.out.println("What is the capital of Spain?");
        String Q3 = Question3.nextLine();
        if (Q3.toLowerCase().equals("madrid")) {
            System.out.println("Sorry, the correct answer is Madrid");
        }
    }
}
