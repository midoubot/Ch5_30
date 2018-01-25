/*
Write a program that prompts the user to enter an amount (e.g., 100), the annual interest rate (e.g., 5), 
and the number of months (e.g., 6) and displays the amount in the savings account after the given month. 
 */
package com.command;
import java.util.Scanner;

public class Ch5_30 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the amount of money you desire to save each month");
        double deposit = keyboard.nextDouble();
        System.out.println("How much is the annual interest rate?");
        double AnnualInterestRate = keyboard.nextDouble();
        System.out.println("Please enter the number of months you want to invest for.");
        int monthsInvested = keyboard.nextInt();

        double monthlyInterestR = calculateMonthlyR(AnnualInterestRate);
        double savings = 0 ;

        for (int i=1; i <= monthsInvested; i++) {
            savings = monthlyDepositIntoSavings(savings, deposit);
            savings = calculateDepositInterest(savings, monthlyInterestR);
        }//for
        String strSavings = String.format("%.2f", savings);
        System.out.println("Your total saving after " + monthsInvested + " month(s) is $" + strSavings);
    }// main
    public static double calculateMonthlyR(double annual){
        return ((annual)/12)/100 ;

    }// calculateMonthlyR
    public static double monthlyDepositIntoSavings(double savings_, double deposit){
        return (deposit + savings_);

    }// monthlyDepositIntoSavings
    public static double calculateDepositInterest(double savings_, double monthlyInterestR_) {
        return (savings_ * monthlyInterestR_) + savings_;

    }// calculateDepositInterest
}//Ch5_30 class
