package com.example.cronoq_group8.quarter2.PracticalExam;

import java.util.Scanner;

public class ProcessAvailability {
    public static void runFeature(Scanner scanner) {
        System.out.println("\n--- UPDATE AVAILABILITY FEATURE ---");
        System.out.println("Set Status (1 = Available, 2 = Busy, 3 = Out of Office): ");
        int choice = scanner.nextInt();
        System.out.println(choice); // Echo input

        if (choice == 1) {
            System.out.println("Teacher Status set to: Available");
        } else if (choice == 2) {
            System.out.println("Teacher Status set to: Busy");
        } else if (choice == 3) {
            System.out.println("Teacher Status set to: Out of Office (Estimated Return Time: 12:30 PM)");
        } else {
            System.out.println("Invalid availability option selected.");
        }
    }
}