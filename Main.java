import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to the Vending Machine");
        System.out.println("1) Chips: $2\n2) M&M's: $1.8\n3) Skittles: $2.5\n4) Water: $1\nPlease Enter a snack Number: ");
        int option = inp.nextInt();
        System.out.println("Please enter number of $1 bills you will be using: ");
        int dollarBills = inp.nextInt();
        if(option == 1){
            double change1 = dollarBills - 2;
            System.out.println("Change returned: " + change1);
        }
        else if(option == 2){
            double change2 = dollarBills - 1.8;
            System.out.println("Change returned: " + change2);
        }
        else if (option == 3){
            double change3 = dollarBills - 2.5;
            System.out.println("Change returned: " + change3);
        }
        else if (option == 4){
            double change4 = dollarBills - 1;
            System.out.println("Change returned: " + change4);
        }
        /*The user is asked for confirmation on the transaction before it is carried out, and if the user
decides to cancel the transaction, they are given a full refund.
• The user is given a departure message that makes them feel good about their snack choice. */
    }


}