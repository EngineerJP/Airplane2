// Jacob Paquette -- COM209 -- final project -- Airline

package com.company;
import java.util.Scanner; // Scanner Class

public class Airline {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please select one of the following: 1. First Class or 2. Economy");
            int first = input.nextInt();
            System.out.println("You entered >> " + first);

            if (first == 1) {
                System.out.println("Your seat in first class is number 1. Thanks for flying with us.");
                System.out.println("Unfortunately there are no more seats in first class. " +
                        "Would you like to fly economy? Would you like to reserve another seat?");
                break;
            }
            else {
                System.out.println("User Error: The choice that you entered is not valid. Please try again.");
            }
        } while(true);

        do {
            System.out.println("If Yes: type 1 --- If No: type 2");
            int flight = input.nextInt();
            System.out.println("You entered >> " + flight);

            if (flight == 2) {
                System.out.println("Have a nice day!");
                break;
            } else {
                System.out.println("User Error: The choice that you entered is not valid. Please try again.");
            }
        } while(true);
    }
}
