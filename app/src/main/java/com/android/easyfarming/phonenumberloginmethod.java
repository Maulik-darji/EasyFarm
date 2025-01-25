package com.android.easyfarming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class phonenumberloginmethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_phonenumberloginmethod);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView backIcon = findViewById(R.id.back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainActivity
                Intent intent = new Intent(phonenumberloginmethod.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close current activity

                // Use transition animation: slide out to the right and slide in from the left
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                //slide_in_left - means when entring to the create account page make it appear as if it is comming
            }
        });
        MaterialButton nextotppage = findViewById(R.id.nextotppage);
        nextotppage.setOnClickListener(v -> {
            // Intent to open Signup activity
            Intent intent = new Intent(phonenumberloginmethod.this, phoneotp.class);
            startActivity(intent);

            // Transition animation: slide in from the right and slide out to the left
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });



    }
}