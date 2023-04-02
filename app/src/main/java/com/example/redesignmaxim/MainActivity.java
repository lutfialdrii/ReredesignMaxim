package com.example.redesignmaxim;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    SessionManager sessionManager;
    TextView tvName;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        ImageButton btnHistoryMenu = findViewById(R.id.btnhistory);
        btnHistoryMenu.setOnClickListener(this);
        ImageButton btnFavoritMenu = findViewById(R.id.btnfavorit);
        btnFavoritMenu.setOnClickListener(this);
        ImageButton btnMenuMenu = findViewById(R.id.btnmenu);
        btnMenuMenu.setOnClickListener(this);

        sessionManager = new SessionManager(MainActivity.this);

        tvName = findViewById(R.id.tvNamee);
        String username = sessionManager.getUserDetail().get(SessionManager.USERNAME);
        tvName.setText("Hi "+username+"!");

    }
    public void onClick(View v) {
        if (v.getId() == R.id.btnhistory) {
            Intent i = new Intent(MainActivity.this, HistoryActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnfavorit) {
            Intent i = new Intent(MainActivity.this, FavoritActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnmenu) {
            Intent i = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(i);
        }
    }
}