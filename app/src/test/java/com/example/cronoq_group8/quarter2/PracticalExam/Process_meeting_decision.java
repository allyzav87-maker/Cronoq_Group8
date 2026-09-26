package com.example.cronoq_group8.quarter2.PracticalExam;

import java.util.Scanner;

public class Process_meeting_decision {
    public static void processDecision(Scanner scanner) {
        System.out.println("Meeting decision: 1-Accept, 2-Clear");
        int decisionChoice = scanner.nextInt();
        System.out.println(decisionChoice); // echo
        scanner.nextLine();

        boolean meetingStatus = (decisionChoice == 1);
        String notifyDecision = meetingStatus
                ? "Your meeting request has been accepted!"
                : "Your meeting request has been cleared.";

        System.out.println(notifyDecision);
    }
}

