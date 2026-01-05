/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kandy kochar
 */

   
import java.util.Scanner;

public class Tenant {
    private String name;
    private int floor;
    private int numBeds;

    // Method to read tenant input from user
    public void read() {
        Scanner scanner = new Scanner(System.in);

        // Get tenant name
        System.out.print("Enter your name: ");
        setName(scanner.nextLine());

         // Get floor number and number of bedrooms
        System.out.print("Enter floor and number of bedrooms: ");
        floor = scanner.nextInt();
        numBeds = scanner.nextInt();
    }

    public void setName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        StringBuilder formatted = new StringBuilder();
        for (String part : parts) {
            formatted.append(Character.toUpperCase(part.charAt(0)))
                     .append(part.substring(1).toLowerCase())
                     .append(" ");
        }
        this.name = formatted.toString().trim();
    }

    //getter for name 
    public String getName() {
        return name;
    }

    //getter for floor
    public int getFloor() {
        return floor;
    }

    //getter for number of bedrooms 
    public int getNumBeds() {
        return numBeds;
    }

    // setter for number of bedrooms 
    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    @Override
    public String toString() {
        return switch (numBeds) {
            case 0 -> "Studio Apartment";
            case 1 -> "1-Bedroom Apartment";
            case 2 -> "2-Bedroom Apartment";
            default -> "Unknown Type";
        };
    }
}
