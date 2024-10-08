import java.util.Scanner;

public class compoundvalue {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = scanner.nextDouble();
        
        double monthlyInterestRate = 0.0375 / 12;
        
        double accountValue = 0;
    
        for (int month = 1; month <= 6; month++) {
            // Compound the value for this month
            accountValue = (accountValue + monthlySavingAmount) * (1 + monthlyInterestRate);
        }
        
        System.out.printf("After the sixth month, the account value is: $%.2f", accountValue);
        scanner.close();
    }
}

