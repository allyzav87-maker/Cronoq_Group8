package com.example.cronoq_group8.quarter2.PracticalExam;

import java.util.Scanner;

public class LoginUser {
    public static void runFeature(Scanner scanner) {
        System.out.println("\n--- LOGIN FEATURE ---");
        System.out.println("Select Role (1 = Teacher, 2 = Student): ");
        int choice = scanner.nextInt();
        System.out.println(choice); // Echo input

        if (choice == 1) {
            System.out.println("Logged in as: Teacher");
        } else if (choice == 2) {
            System.out.println("Logged in as: Student");
        } else {
            System.out.println("Invalid role selected.");
        }
    }
}