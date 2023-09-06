import java.util.Scanner;

public class Lesson2_Excercise_2 {
    public static void main(String[] args) {
        Scanner maths_calculation = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num = maths_calculation.nextInt();

        Scanner maths_calculation2 = new Scanner(System.in);
        System.out.println("Please enter your second number?");
        int num2 = maths_calculation2.nextInt();

        System.out.println(2*(num + num2 - 9)/2);
    }
}
