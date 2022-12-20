package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);
    }

    public void showWelcome(View v ) {
        TextView welcomeMessage = (TextView) v.findViewById(R.id.show_welcome);
        String message = "Welcome, Daria!";
        welcomeMessage.setText(message);
    }
}