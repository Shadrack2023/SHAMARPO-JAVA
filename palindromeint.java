/*(Palindrome integer) Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome integer. An integer is palindrome
if it reads the same from right to left and from left to right. A negative integer is
treated the same as a positive integer. Here are sample runs of this program: */

import java.util.Scanner;

public class palindromeint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();
        
        // Take the absolute value to handle negative numbers
        int absNumber = Math.abs(number);
        
        // Extract the hundreds, tens, and units digits
        int hundreds = absNumber / 100;
        int units = absNumber % 10;
        
        if (hundreds == units) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        
        input.close();
    }
}
