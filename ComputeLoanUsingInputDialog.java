package com.teamtreehouse;

import javax.swing.JOptionPane;

 // This is imported from the Java library

public class ComputeLoanUsingInputDialog {
    public static void main(String[] args) {

        /* This project will be an example of dialog input boxes. We will seek to gain input from users other than through console */

        String annualInterestRateString = JOptionPane.showInputDialog(
                "Enter annual intrest rate, for example, 8.25:");

        // Dialog boxes are defaulted for strings. We need to convert or cast.

        double annualInterestRate =
                Double.parseDouble(annualInterestRateString);
        
        double monthlyInterestRate = annualInterestRate / 1200;

        String numberOfYearsString = JOptionPane.showInputDialog("Enter number of years as integer:");

        int numberOfYears = Integer.parseInt(numberOfYearsString);

        String loanString = JOptionPane.showInputDialog("Enter loan amount here: ");

        double loanAmount = Double.parseDouble(loanString);

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -1 / Math.pow(1+ monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        monthlyPayment = (int) (monthlyPayment * 100) / 100.0;
        totalPayment = (int)( totalPayment * 100) / 100.0;

        String output = "The monthly payment is $" + monthlyPayment + "\n The total payment is $" + totalPayment;
        JOptionPane.showMessageDialog(null, output);





    }

}
