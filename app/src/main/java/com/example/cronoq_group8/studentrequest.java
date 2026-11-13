package com.example.cronoq_group8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class studentrequest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentrequest);

        // 1. Back Button -> Returns to Teacher Menu
        Button backButton = findViewById(R.id.editButton4);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(studentrequest.this, TeacherMenuActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // 2. Submit Button -> Goes to processmeetingdecisionaccepted
        Button submitButton = findViewById(R.id.editButton2);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(studentrequest.this, processmeetingdecisionaccepted.class);
                startActivity(intent);
            }
        });

        // 3. Decline Button -> Goes to removependingrequest
        Button declineButton = findViewById(R.id.editButton5);
        declineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(studentrequest.this, removependingrequest.class);
                startActivity(intent);
            }
        });
    }
