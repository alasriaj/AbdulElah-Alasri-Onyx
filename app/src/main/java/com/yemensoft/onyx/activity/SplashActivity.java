package com.yemensoft.onyx.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.yemensoft.onyx.R;
import com.yemensoft.onyx.classes.REFERENCE_APP;

import java.util.Timer;
import java.util.TimerTask;



public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_splash);

    }



    @Override
    protected void onStart() {
        super.onStart();
        new REFERENCE_APP(SplashActivity.this);
        startActivityMainDelay();

    }

    private void startActivityMainDelay() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        };
        new Timer().schedule(task, 3000);
    }
}