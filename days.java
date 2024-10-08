/*(Find the number of days in a month) Write a program that prompts the user to enter
the month and year and displays the number of days in the month. For example, if
the user entered month 2 and year 2012, the program should display that February
2012 has 29 days. If the user entered month 3 and year 2015, the program should
display that March 2015 has 31 days. */

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the month and year
        System.out.print("Enter the month (1 for January, 2 for February, ..., 12 for December): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        // Determine the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);
        
        // Get the name of the month
        String monthName = getMonthName(month);
        
        // Display the result
        System.out.println(monthName + " " + year + " has " + daysInMonth + " days.");
        
        input.close();
    }
    
    // Method to determine the number of days in a given month of a specific year
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; // Invalid month
        }
    }
    
    // Method to determine if a given year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    // Method to get the name of the month
    public static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month";
        }
    }
}
