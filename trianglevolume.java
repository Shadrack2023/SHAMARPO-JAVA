import java.util.Scanner;

public class trianglevolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the sides of the equilateral triangle: ");
        double side = scanner.nextDouble();
        
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        
        System.out.print("Enter the length of the prism (volume height): ");
        double length = scanner.nextDouble();
        
        double volume = area * length;
        
        System.out.println("The area of the equilateral triangle is: " + area);
        System.out.println("The volume of the triangular prism is: " + volume);
        
        scanner.close();
    }
}
