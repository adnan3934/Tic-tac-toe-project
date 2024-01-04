package com.example.ticoldmodify;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class splashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);

        // Simulate a delay (e.g., 2 seconds) before moving to the main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashactivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finish the splash activity
            }
        }, 2000); // 2000 milliseconds (2 seconds) delay
    }
}
