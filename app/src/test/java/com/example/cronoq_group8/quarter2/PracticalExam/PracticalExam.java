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
                    LoginUser.runFeature(scanner);
                    break;
                case 2:
                    ProcessAvailability.runFeature(scanner);
                    break;
                case 3:
                    ProcessMeetingDecision.runFeature(scanner);
                    break;
                case 4:
                    Remove_pending_request.runFeature(scanner);
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