package com.example.ramesh5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ramesh5.R.id;

public class SecondActivity extends AppCompatActivity {

    TextView textViewUsername, textViewPassword = findViewById(id.textViewPassword);

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        textViewUsername = findViewById(R.id.textViewUsername);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String username = extras.getString("username");
            String password = extras.getString("password");
            textViewUsername.setText("Username: " + username);
            textViewPassword.setText("Password: " + password);
        }
    }
}
