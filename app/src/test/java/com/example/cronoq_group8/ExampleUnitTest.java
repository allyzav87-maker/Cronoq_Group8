package com.example.cronoq_group8;

import com.example.cronoq_group8.quarter2.PracticalExam.PracticalExam;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ExampleUnitTest {

    @Test
    public void testCompleteSystemFlow() {
        // 1. THE VIRTUAL KEYBOARD
        StringBuilder simulatedUserInput = new StringBuilder();

        System.out.println("--- GENERATING SIMULATED USER INPUTS ---");

        // PART 1: Simulate Menu Cycles using a loop
        int cycle = 1;
        while (cycle <= 4) {
            // First, enter the main menu option matching the current cycle
            simulatedUserInput.append(cycle).append("\n");

            if (cycle == 1) {
                // Feature 1 (LoginUser): Select Role (1 = Teacher)
                simulatedUserInput.append("1\n");
            } else if (cycle == 2) {
                // Feature 2 (ProcessAvailability): Set Status (1 = Available)
                simulatedUserInput.append("1\n");
            } else if (cycle == 3) {
                // Feature 3 (ProcessMeetingDecision): Decision Choice (1 = Accept)
                simulatedUserInput.append("1\n");
            } else if (cycle == 4) {
                // Feature 4 (Remove_pending_request): Confirm Deletion (1 = Yes)
                simulatedUserInput.append("1\n");
            }
            cycle++;
        }

        // PART 2: Exit Option (Option 5 exits the main loop)
        simulatedUserInput.append("5\n");

        System.out.println("--- INPUT GENERATION COMPLETE ---\n");

        // 2. STREAM CONVERSION
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedUserInput.toString().getBytes());

        // 3. AUTOMATED SCANNER
        Scanner scanner = new Scanner(inputStream);

        // 4. RUN CHRONOQ SYSTEM
        PracticalExam.runApp(scanner);
    }
}