import java.util.*;
public class L4E1 {
    public static void main(String[] args) {
        Scanner firstname = new Scanner(System.in);
        System.out.println("What is your first name?: ");
        String first = firstname.nextLine();

        Scanner surname = new Scanner(System.in);
        System.out.println("What is your surname?: ");
        String sur = surname.nextLine();

        Scanner total_value = new Scanner(System.in);
        System.out.println("What is your total value of your order?: ");
        int total = total_value.nextInt();

        Scanner total_deposit = new Scanner(System.in);
        System.out.println("Enter the amount you wish to pay as deposit?: ");
        int deposit = total_deposit.nextInt();

        System.out.println("== RECEIPT ==");
        System.out.println("Customer:" + first.charAt(0) + sur);
        System.out.println("Order Total £" + total);
        System.out.println("Deposit Paid £" + deposit);
        System.out.println("Remainder £" + (total - deposit));

        if (deposit >= 250) {
            System.out.println("You get a free toaster!");
        }



        }

    }
