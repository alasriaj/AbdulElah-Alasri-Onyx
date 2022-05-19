package com.yemensoft.onyx.activity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.yemensoft.onyx.R;
import com.yemensoft.onyx.classes.REFERENCE_APP;
import com.yemensoft.onyx.models.LoginRes;

public class MainActivity extends AppCompatActivity {

    Gson gson = new Gson();
    private LoginRes loginRes = new LoginRes();
    private TextView tv_balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_main);
        iniComponent();
    }

    protected void iniComponent() {
        tv_balance = findViewById(R.id.tv_balance);
        String temp = new REFERENCE_APP(MainActivity.this).getValue("loginRes");
        if (temp != null) {
            loginRes = gson.fromJson(temp, LoginRes.class);
            if (loginRes.Data != null) {
                if (loginRes.Data.Login != null) {
                    if (loginRes.Data.Login.SHOW_AGENT_BALENCE != null && loginRes.Data.Login.LOCL_CUR_CODE != null) {
                        tv_balance.setText(loginRes.Data.Login.SHOW_AGENT_BALENCE + " " + loginRes.Data.Login.LOCL_CUR_CODE);
                    }
                }
            }
        }
    }
}