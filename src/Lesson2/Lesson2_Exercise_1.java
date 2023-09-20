package Lesson2;

import java.util.*;

public class Lesson2_Exercise_1 {
    public static void main(String[] args) {
        Scanner character = new Scanner(System.in);
        System.out.println("What is the name of your main character?");
        String chara = character.nextLine();

        Scanner hobby = new Scanner(System.in);
        System.out.println("What is your hobby?");
        String hob = hobby.nextLine();

        System.out.println(chara +" knew that he had to get better at " + hob + "\n" +
                "he wanted to succeed. He had been spending every waking moment of\n" +
                "his free time practicing and perfecting his craft.");
    }
}
