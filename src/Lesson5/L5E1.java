package Lesson5;

import java.util.Scanner;

public class L5E1 {
    public static void main(String[] args) {
        Scanner BaseNumber = new Scanner (System.in);
        System.out.print("Enter base number: ");
        Integer Base = BaseNumber.nextInt();

        for (int count=1; count<=12; count++)
        {
            System.out.println(count*Base);
        }

    }
}
