package com.example.cronoq_group8.quarter2.PracticalExam;

import java.util.Scanner;

public class Remove_pending_request {

    public static void runFeature(Scanner scanner) {
        System.out.println("\n--- REMOVE PENDING REQUEST FEATURE ---");
        System.out.println("Confirm deletion (1 = Yes, 2 = No): ");
        int choice = scanner.nextInt();
        System.out.println(choice); // Echo input

        if (choice == 1) {
            System.out.println("Pending request removed successfully.");
        } else if (choice == 2) {
            System.out.println("Request kept in queue.");
        } else {
            System.out.println("Invalid selection.");
        }
    }
}