package Lesson3;

import java.util.*;
public class L3E1 {
    public static void main(String[] args) {
        Scanner firstname = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first = firstname.nextLine();

        Scanner surname = new Scanner(System.in);
        System.out.println("Enter your surname: ");
        String sur = surname.nextLine();

        Scanner YOB = new Scanner(System.in);
        System.out.println("Enter your year of birth YYYY");
        String Year = YOB.nextLine();

        System.out.println("Username: "+ first.charAt(0)+sur.toLowerCase());
        System.out.println("Password: "+ sur.charAt(0)+first.toUpperCase()+Year);



    }
}
