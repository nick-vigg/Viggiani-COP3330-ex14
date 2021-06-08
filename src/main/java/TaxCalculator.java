/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double subtotal = input.nextDouble();
        System.out.println("What is the order state?");
        String state = input.nextLine();
        double tax = .055*subtotal;
        double total = subtotal + tax;

        String taxComment = "";
        String subTotalComment ="";

        if(state.equals("WI")){

            taxComment = String.format("The tax is $%.2f.\n",(tax/100)*subtotal);
            subTotalComment= String.format("The subtotal is $%.2f.\n", subtotal);
            total += (subtotal*(tax/100));

        }
        String totalComment = String.format("The total is $%.2f.", total);

        System.out.print(subTotalComment + taxComment + totalComment);
    }
}
