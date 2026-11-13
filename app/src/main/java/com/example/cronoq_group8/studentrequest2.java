package com.example.cronoq_group8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class studentrequest2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentrequest2);

        Button backButton = findViewById(R.id.editButton4);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(studentrequest2.this, TeacherMenuActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button submitButton = findViewById(R.id.editButton2);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(studentrequest2.this, processmeetingdecisionaccepted.class);
                startActivity(intent);
            }
        });

        Button declineButton = findViewById(R.id.editButton5);
        declineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(studentrequest2.this, removependingrequest.class);
                startActivity(intent);
            }
        });
    }
}