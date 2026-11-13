package com.example.cronoq_group8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class processmeetingdecisionaccepted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.processmeetingdecisionaccepted);

        Button dismissButton = findViewById(R.id.button10);
        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(processmeetingdecisionaccepted.this, TeacherMenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}