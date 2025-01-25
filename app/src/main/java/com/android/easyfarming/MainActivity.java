package com.android.easyfarming;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find and set click listener for signup button
        MaterialButton signupButton = findViewById(R.id.singupbutton); // Corrected button name
        signupButton.setOnClickListener(v -> {
            // Intent to open Signup activity
            Intent intent = new Intent(MainActivity.this, Signup.class);
            startActivity(intent);

            // Transition animation: slide in from the right and slide out to the left
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });

        MaterialButton phoneButton = findViewById(R.id.phonenummethod);
        phoneButton.setOnClickListener(v -> {
            // Intent to open Signup activity
            Intent intent = new Intent(MainActivity.this, phonenumberloginmethod.class);
            startActivity(intent);
            // Transition animation: slide in from the right and slide out to the left
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });

        // Handling window insets for system bars (status bar and navigation bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            // Get system bars inset
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        MaterialButton loginButton = findViewById(R.id.loginbutton);
        loginButton.setOnClickListener(v -> {
            // Intent to open Login activity
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
            // Transition animation: slide in from the right and slide out to the left
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });


    }
}
