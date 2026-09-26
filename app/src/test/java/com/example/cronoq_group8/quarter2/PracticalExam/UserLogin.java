 package com.example.cronoq_group8.quarter2.PracticalExam;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = " ";
        String correctPassword = " ";

        System.out.println("================================");
        System.out.println("          CHRONOQ");
        System.out.println("  Real-Time Availability System");
        System.out.println("================================");

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) &&
                password.equals(correctPassword)) {

            System.out.println("\nLogin successful!");
            System.out.println("Welcome to ChronoQ!");

            System.out.println("\n--- Availability ---");
            System.out.println("1. Available");
            System.out.println("2. Busy");
            System.out.println("3. Away");

            System.out.print("Choose your status: ");
            int choice = scanner.nextInt();

            String status;

            switch (choice) {
                case 1:
                    status = "Available";
                    break;
                case 2:
                    status = "Busy";
                    break;
                case 3:
                    status = "Away";
                    break;
                default:
                    status = "Unknown";
            }

            System.out.println("\nYour current status: " + status);

        } else {
            System.out.println("\nInvalid username or password.");
            System.out.println("Please try again.");
        }

        scanner.close();
    }
}