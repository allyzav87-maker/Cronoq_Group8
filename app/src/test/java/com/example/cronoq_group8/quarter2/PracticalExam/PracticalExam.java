package com.example.cronoq_group8.quarter2.PracticalExam;

import java.util.Scanner;

public class PracticalExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        runApp(scanner);
    }

    public static void runApp(Scanner scanner) {
        boolean exit = false;

        while (!exit) {
            MainMenu.runFeature();

            System.out.print("Enter choice: ");
            if (!scanner.hasNextInt()) {
                break;
            }

            int choice = scanner.nextInt();
            System.out.println(choice); // Echo input

            switch (choice) {
                case 1:
                    UserLogin.runFeature(scanner);
                    break;
                case 2:
                    // ProcessAvailability feature call
                    System.out.println("\n--- PROCESS AVAILABILITY FEATURE ---");
                    System.out.println("Select Status (1 = Available, 2 = Busy, 3 = Out of Office): ");
                    int status = scanner.nextInt();
                    System.out.println(status); // Echo input
                    if (status == 3) {
                        System.out.println("Status updated to: Out of Office (Estimated Return Time: 12:30 PM)");
                    } else if (status == 1) {
                        System.out.println("Status updated to: Available");
                    } else if (status == 2) {
                        System.out.println("Status updated to: Busy");
                    } else {
                        System.out.println("Invalid status option selected.");
                    }
                    break;
                case 3:
                    ProcessMeetingDecision.runFeature(scanner);
                    break;
                case 4:
                    Remove_pending_request.removePendingRequest(scanner);
                    break;
                case 5:
                    System.out.println("\nExiting ChronoQ System. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again.");
                    break;
            }
        }
    }
}