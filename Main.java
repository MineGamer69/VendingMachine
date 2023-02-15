import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to the Vending Machine");
        System.out.println("1) Chips: $2\n2) M&M's: $1.8\n3) Skittles: $2\n4) Water: $1\nPlease Enter a snack Number: ");
        int option = inp.nextInt();
        System.out.println("Please enter number of $1 bills you will be using: ");
        int dollarBills = inp.nextInt();
        //Next: print the user's change
    }


}