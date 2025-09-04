package com.example.minhfirstapp;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy layout gốc
        LinearLayout rootLayout = findViewById(R.id.rootLayout);

        // Căn giữa nội dung trong layout
        rootLayout.setGravity(Gravity.CENTER);
    }
}