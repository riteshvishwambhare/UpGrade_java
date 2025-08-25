package switchStatement;

import java.util.Scanner;

public class VehicleTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type ('c' for car, 'b' for bike, 't' for truck): ");
        char type = sc.next().charAt(0);

        switch (type) {
            case 'c':
            case 'C':
                System.out.println("Vehicle is a Car.");
                break;

            case 'b':
            case 'B':
                System.out.println("Vehicle is a Bike.");
                break;

            case 't':
            case 'T':
                System.out.println("Vehicle is a Truck.");
                break;

            default:
                System.out.println("Invalid vehicle type!");
        }

        sc.close();
    }
}
