/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kandy kochar
 */
public class Rent {
    private double[][] rents = {
        {500, 600, 700},   // Floor 1
        {650, 750, 850},   // Floor 2
        {800, 900, 1000},  // Floor 3
        {950, 1050, 1150}, // Floor 4
        {1100, 1200, 1300} // Floor 5
    };
// Method to calculate rent based on floor and apartment type
    public double calculateRent(int floor, int numBeds) {
        if (floor >= 1 && floor <= 5 && numBeds >= 0 && numBeds <= 2) {
            return rents[floor - 1][numBeds];
        } else {
            System.out.println("Invalid floor or number of bedrooms.");
            return 0;
        }
    }
}

   