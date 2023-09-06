import java.util.*;
public class Lesson_2 {
    public static void main(String[] args) {
        System.out.print("Hello World");

        //println creates a new line
        System.out.println("the mouse ran up the clock");
        System.out.println("Hickory Dickory dock!");

        //You can also use \n to write a new line as well, it can be used with println
        System.out.println("Hickory Dickory Dock!\nthe mouse ran up the clock");

        //You can also add quotes into your output as well
        System.out.println("She said \"Hello\" to me.");
        System.out.println("She said "+"\"Hello\""+" to me.");

        //Asking for user input
        Scanner test_input = new Scanner(System.in);
        System.out.print("What is your name?");
        String firstname = test_input.nextLine();

        //Creating a variable and printing it out
        String firstname_test = "Otormiefe";
        System.out.println(firstname_test);

        //You can alter the value of the code since your code is reading top to down
        firstname = "Mary";
        System.out.println(firstname);

        //This is how you combine strings
        Scanner user_input = new Scanner(System.in);
        System.out.print("What is your first name?");
        String firstName_input = user_input.nextLine();

        System.out.println("What is your last name?");
        String lastName = user_input.nextLine();

        System.out.println("Hello" + firstName_input + lastName);

        //How to store numbers
        int age = 42;
        System.out.print(age);

        //Other Java Number Types
        short gears = 3;
        int median = 103491;
        long age2 = 222358490;

        float pi = 3.1415926f;
        double pi2 = 3.14159265358979;

        
    }}
