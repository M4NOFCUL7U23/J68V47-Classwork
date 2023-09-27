package Lesson5;
import java.util.*;



public class L5E3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int score = 0;


        for (int count=0; count<=10; count=++) {
            int num1 = random.nextInt();
            int num2 = random.nextInt();
            int ans = num1 * num2;

            System.out.println(num1 + " x " + num2 + " = ");

            int answer = input.nextInt();
            if (answer == ans) {
                System.out.println("Correct");
                score++;
            }
        }
            System.out.println("Your Score = " + score);



    }
}
