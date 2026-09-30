package com.example.cronoq_group8.quarter2.PracticalExam;

import java.util.Scanner;

public class ProcessMeetingDecision {
    public static void runFeature(Scanner scanner) {
        System.out.println("\n--- PROCESS MEETING DECISION FEATURE ---");
        System.out.println("Select Decision (1 = Accept, 2 = Decline): ");
        int choice = scanner.nextInt();
        System.out.println(choice); // Echo input

        if (choice == 1) {
            System.out.println("Meeting accepted successfully.");
        } else if (choice == 2) {
            System.out.println("Meeting declined.");
        } else {
            System.out.println("Invalid decision selected.");
        }
    }
}