package com.example.cronoq_group8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class processmeetingdecision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.processmeetingdecision);

        Button backButton = findViewById(R.id.accept2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(processmeetingdecision.this, teacherstatus.class);
                startActivity(intent);
                finish();
            }
        });

        Button acceptButton = findViewById(R.id.Accept);
        acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(processmeetingdecision.this, teacheracceptedmeeting.class);
                startActivity(intent);
            }
        });

        Button declineButton = findViewById(R.id.accept);
        declineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(processmeetingdecision.this, teacherdeclinedmeeting.class);
                startActivity(intent);
            }
        });
    }
}