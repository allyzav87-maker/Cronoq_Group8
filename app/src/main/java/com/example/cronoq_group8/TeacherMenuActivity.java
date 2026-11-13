package com.example.cronoq_group8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TeacherMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teachermenulayout);

        Button backButton = findViewById(R.id.button5);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherMenuActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button btnTeacher1 = findViewById(R.id.button);
        btnTeacher1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherMenuActivity.this, studentrequest3.class);
                startActivity(intent);
            }
        });

        Button btnTeacher2 = findViewById(R.id.button4);
        btnTeacher2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherMenuActivity.this, studentrequest.class);
                startActivity(intent);
            }
        });

        Button btnTeacher3 = findViewById(R.id.button3);
        btnTeacher3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherMenuActivity.this, studentrequest2.class);
                startActivity(intent);
            }
        });
    }
}