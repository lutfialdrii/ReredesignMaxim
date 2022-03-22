package com.example.redesignmaxim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HistoryActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ImageButton btnMenuMenu = findViewById(R.id.btnmenu);
        btnMenuMenu.setOnClickListener(this);
        ImageButton btnFavoritMenu = findViewById(R.id.btnfavorit);
        btnFavoritMenu.setOnClickListener(this);
        ImageButton btnDashboardMenu = findViewById(R.id.btndashboard);
        btnDashboardMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnmenu) {
            Intent i = new Intent(HistoryActivity.this, MenuActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnfavorit) {
            Intent i = new Intent(HistoryActivity.this, FavoritActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btndashboard) {
            Intent i = new Intent(HistoryActivity.this, MainActivity.class);
            startActivity(i);
        }

    }
}