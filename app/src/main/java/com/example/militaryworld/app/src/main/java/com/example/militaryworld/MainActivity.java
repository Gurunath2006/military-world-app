package com.example.militaryworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button countries = findViewById(R.id.countriesButton);
        Button tanks = findViewById(R.id.tanksButton);
        Button aircraft = findViewById(R.id.aircraftButton);
        Button helicopters = findViewById(R.id.helicopterButton);
        Button ships = findViewById(R.id.shipsButton);
        Button submarines = findViewById(R.id.submarineButton);
        Button missiles = findViewById(R.id.missileButton);
        Button search = findViewById(R.id.searchButton);

        countries.setOnClickListener(v ->
                showMessage("🌍 Countries"));

        tanks.setOnClickListener(v ->
                showMessage("🪖 Tanks"));

        aircraft.setOnClickListener(v ->
                showMessage("✈️ Aircraft"));

        helicopters.setOnClickListener(v ->
                showMessage("🚁 Helicopters"));

        ships.setOnClickListener(v ->
                showMessage("🚢 Ships"));

        submarines.setOnClickListener(v ->
                showMessage("⚓ Submarines"));

        missiles.setOnClickListener(v ->
                showMessage("🚀 Missiles"));

        search.setOnClickListener(v ->
                showMessage("🔍 Search"));
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
