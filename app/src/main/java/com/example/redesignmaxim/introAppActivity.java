package com.example.redesignmaxim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class introAppActivity extends AppCompatActivity {

    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_app);

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(4000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {

                    sessionManager = new SessionManager(introAppActivity.this);

                    if(!sessionManager.isLoggedIn()){
                        startActivity(new Intent(introAppActivity.this, LoginActivity.class));
                    } else {
                        startActivity(new Intent(introAppActivity.this, MainActivity.class));
                    }
                    finish();
                }
            }
        };
        thread.start();
    }
}