import java.util.Scanner;

public class linearequ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the coefficients a, b, c, d, e, and f
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter value for c: ");
        double c = input.nextDouble();
        System.out.print("Enter value for d: ");
        double d = input.nextDouble();
        System.out.print("Enter value for e: ");
        double e = input.nextDouble();
        System.out.print("Enter value for f: ");
        double f = input.nextDouble();
        
        // Calculate the determinant
        double determinant = a * d - b * c;
        
        // Check if the determinant is zero
        if (determinant == 0) {
            System.out.println("The equation has no solution.");
        } else {
            // Calculate x and y using Cramer's rule
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            System.out.println("The solution is x = " + x + " and y = " + y);
        }
        
        input.close();
    }
}
