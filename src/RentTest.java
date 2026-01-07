/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kandy kochar
 */
import java.util.Scanner;

public class RentTest {
    public static void main(String[] args) {
        Tenant tenant = new Tenant();
        Rent rent = new Rent();

        tenant.read(); // Get name, floor, and number of bedrooms
        //Calculate rent based on floor and bedroom type
        double amount = rent.calculateRent(tenant.getFloor(), tenant.getNumBeds());

        displayResult(tenant, amount);
    }
         // Method to display final output
    public static void displayResult(Tenant tenant, double rentAmount) {
        String aptType = switch (tenant.getNumBeds()) {
            case 0 -> "studio apartment";
            case 1 -> "1 bedroom apartment";
            case 2 -> "2 bedrooms apartment";
            default -> "unknown type";
        };
// print result
        System.out.println();
        System.out.println(tenant.getName() + " wants to rent " + aptType + " on floor number " + tenant.getFloor());
        System.out.printf("Rent = $%.2f per month%n", rentAmount);
    }
}
