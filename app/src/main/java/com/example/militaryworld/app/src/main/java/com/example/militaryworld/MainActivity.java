package com.example.militaryworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView title = new TextView(this);
        title.setText("☀️ MILITARY WORLD");
        title.setTextSize(28);

        Button countries = new Button(this);
        countries.setText("🌍 Countries");

        Button aircraft = new Button(this);
        aircraft.setText("✈️ Aircraft");

        Button tanks = new Button(this);
        tanks.setText("🪖 Tanks");

        setContentView(title);
    }
}
