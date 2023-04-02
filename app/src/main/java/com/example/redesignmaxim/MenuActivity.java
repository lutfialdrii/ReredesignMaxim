package com.example.redesignmaxim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogout;
    SessionManager sessionManager;
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
        Button btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(this);

        sessionManager = new SessionManager(MenuActivity.this);
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
        } else if (v.getId() == R.id.btnLogout){
            sessionManager.logoutSession();
            Intent i = new Intent(MenuActivity.this, LoginActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(i);
        }

    }
}