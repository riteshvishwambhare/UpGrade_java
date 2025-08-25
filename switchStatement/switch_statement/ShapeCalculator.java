package switchStatement.switch_statement;

import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a shape to calculate area:");
        System.out.println("c - Circle || s - Square || t - Trangle");
        char choice = sc.next().charAt(0);

        double area;

        switch (choice) {
            case 'c':
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + area);
                break;

            case 's':
                System.out.print("Enter the side length of the square: ");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of the square: " + area);
                break;

            case 't':
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of the triangle: " + area);
                break;

            default:
                System.out.println("Wrong choice..! Please select c, s, or t.");
        }

        sc.close();
    }
}
