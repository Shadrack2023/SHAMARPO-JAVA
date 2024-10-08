import java.util.Scanner;

class DistanceConv {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This program will convert miles to kilometers.");
    
        System.out.print("Enter distance (miles): ");
        
        double numMiles = scanner.nextDouble();
        
        double kilometers = numMiles * 1.6;
        
        System.out.println(numMiles + " miles is equal to " + kilometers + " kilometers.");
    
        scanner.close();
    }
}
