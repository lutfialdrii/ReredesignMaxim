package com.example.redesignmaxim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton btnHistoryMenu = findViewById(R.id.btnhistory);
        btnHistoryMenu.setOnClickListener(this);
        ImageButton btnFavoritMenu = findViewById(R.id.btnfavorit);
        btnFavoritMenu.setOnClickListener(this);
        ImageButton btnDashboardMenu = findViewById(R.id.btndashboard);
        btnDashboardMenu.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btnhistory) {
            Intent i = new Intent(MenuActivity.this, HistoryActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnfavorit) {
            Intent i = new Intent(MenuActivity.this, FavoritActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btndashboard) {
            Intent i = new Intent(MenuActivity.this, MainActivity.class);
            startActivity(i);
        }

    }
}