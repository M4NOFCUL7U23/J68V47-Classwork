package Examples;

import java.util.Scanner;

public class IF_statements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the answer to the sum 3 + 4? ");
        int answer = input.nextInt();
        if (answer == 7) {
            System.out.println("Well done that is correct");

        }

    }
}
