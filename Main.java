import java.util.Scanner;
public class Main{
    private static double possibleRefund;
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
            possibleRefund = 2.0;
        }
        else if(option == 2){
            double change2 = dollarBills - 1.8;
            System.out.println("Change returned: " + change2);
            possibleRefund = 1.8;
        }
        else if (option == 3){
            double change3 = dollarBills - 2.5;
            System.out.println("Change returned: " + change3);
            possibleRefund = 2.5;
        }
        else if (option == 4){
            double change4 = dollarBills - 1;
            System.out.println("Change returned: " + change4);
            possibleRefund = 1.0;
        } 

        System.out.println("Would you like to confirm the transaction?(1 for yes, 2 for no): ");
        int confirmationOfOrder;
        confirmationOfOrder = inp.nextInt();
        if (confirmationOfOrder == 1 ) {
            System.out.println("Thank you for your purchase, have a nice day!");
        }
        else if (confirmationOfOrder == 2 ) {
            System.out.println("Your total refund is: $" + dollarBills + ". Have a nice day!");
        }
        else {
            while(confirmationOfOrder != 1 || confirmationOfOrder != 2) {
                System.out.println("Error, Please Enter a valid number(1 to confirm your purchase, 2 for a refund): ");
                confirmationOfOrder = inp.nextInt();
                if (confirmationOfOrder == 1 ) {
                    System.out.println("Thank you for your purchase, have a nice day!");
                    break;
                }
                else if (confirmationOfOrder == 2 ) {
                    System.out.println("Your total refund is: $" + dollarBills + ". Have a nice day!");
                    break;
                }
            }
        }
        
    }
}