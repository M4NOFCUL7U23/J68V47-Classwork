package Lesson6;
import java.util.*;
public class L6E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {System.out.println("Menu");
            System.out.println("1. Say hello");
            System.out.println("2. Tell me the time");
            System.out.println("3. Tell me a joke");
            System.out.println("4. Quit");

            System.out.print("Input an option (1-4): ");
            option = scanner.nextInt();
            System.out.format("You chose option %d %n", option);
            if (option == 1){
                System.out.println("HELLO");
        }
        }while (option !=4);
    }
}
