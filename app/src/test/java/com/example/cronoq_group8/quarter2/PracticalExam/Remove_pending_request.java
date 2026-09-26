package com.example.cronoq_group8.quarter2.PracticalExam;

import java.util.Scanner;

public class Remove_pending_request {
    public static void removePendingRequest(Scanner scanner) {
        System.out.print("Confirm removal? (y/n): ");
        String confirm = scanner.nextLine();
        System.out.println(confirm); // echo

        if (confirm.equalsIgnoreCase("y")) {
            String requestDecline = "Pending request removed successfully.";
            String notifyDeclineRequest = "Meeting request declined notification.";
            System.out.println(requestDecline);
            System.out.println(notifyDeclineRequest);
        } else {
            System.out.println("Request not removed.");
        }
    }
}