package com.yemensoft.onyx.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;
import com.yemensoft.onyx.R;
import com.yemensoft.onyx.classes.EncryptionData;
import com.yemensoft.onyx.classes.ISCONNECTED;
import com.yemensoft.onyx.classes.REFERENCE_APP;
import com.yemensoft.onyx.classes.RetroClient;
import com.yemensoft.onyx.classes.Tools;
import com.yemensoft.onyx.interfaces.JsonPlaceHolderApi;
import com.yemensoft.onyx.models.LoginRes;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private Button btn_login;
    private EditText e_username, e_password, e_agent_code;
    private TextInputLayout l_username ,l_password, l_agent_code;
    private View parent_view;
    private ISCONNECTED tools;
    private LoginRes loginRes;
    Gson gson = new Gson();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_login);
        iniComponent();
    }

    private void iniComponent() {
        tools =new ISCONNECTED(LoginActivity.this);
        parent_view = findViewById(android.R.id.content);
        btn_login = findViewById(R.id.btn_login);
        e_username = findViewById(R.id.e_username);
        e_password = findViewById(R.id.e_password);
        e_agent_code = findViewById(R.id.e_agent_code);
        l_username = findViewById(R.id.l_username);
        l_password = findViewById(R.id.l_password);
        l_agent_code = findViewById(R.id.l_agent_code);
        btn_login.setOnClickListener(view -> {

            if (!new ISCONNECTED(LoginActivity.this).isConnected()) {
                tools.Show(LoginActivity.this,"Check Wifi or Mobile Data");
            } else {


                l_username.setErrorEnabled(false);
                l_password.setErrorEnabled(false);
                l_agent_code.setErrorEnabled(false);

                if (e_agent_code.getText().toString().isEmpty()) {
                    l_agent_code.setError("عزيزي المستخدم حقل الجوال مطلوب!");
                    e_agent_code.requestFocus();
                    return;
                } else if (e_username.getText().toString().isEmpty()) {
                    l_username.setError("عزيزي المستخدم حقل الجوال 9 أرقام!");
                    e_username.requestFocus();
                    return;
                } else if (e_password.getText().toString().isEmpty()) {
                    l_password.setError("عزيزي المستخدم حقل كلمة المرور مطلوب!");
                    e_password.requestFocus();
                    return;
                } else {
                    CHK_LOGIN_USER(e_agent_code.getText().toString(),e_username.getText().toString(), e_password.getText().toString());
                }
            }

        });
    }

    public void CHK_LOGIN_USER(final String ag_code,final String user, final String pass) {
        if (!new ISCONNECTED(LoginActivity.this).isConnected()) {
            tools.Show(LoginActivity.this,"Check Wifi or Mobile Data");
        } else {
            try {
                Tools.sh_load(LoginActivity.this);
                 Map<String, Object> inputs = new HashMap<>();
                inputs.put("P_AGT_CODE", ag_code);
                inputs.put("P_AGT_NO", ag_code);
                inputs.put("P_APP_VER", "1.9.27%201.11.2020");
                inputs.put("P_DVC_SRL", "101010");
                inputs.put("P_MOB_TYP", "1");
                inputs.put("P_USER_CODE", user);
                inputs.put("P_USER_PASS", EncryptionData.calculateRFC2104HMAC(pass));
                JsonPlaceHolderApi api = RetroClient.getApiService();
                Map<String, Object> iend=new HashMap<>();
                iend.put("Value",inputs);
                Call<LoginRes> call = api.login(iend);
                call.enqueue(new Callback<LoginRes>() {
                    @Override
                    public void onResponse(@NonNull Call<LoginRes> call, @NonNull Response<LoginRes> response) {
                        Tools.sh_load();
                        loginRes = response.body();
                        Log.d("loginRes", response.body() + "");
                        if (response.isSuccessful()) {

                            Log.d("loginRes", response.body() + "");
                            Log.d("loginRes", loginRes + "");
                            Log.d("loginRes", gson.toJson(loginRes) + "");
                            Log.d("loginRes", loginRes.result.getErrMsg() + "");

                            if(loginRes.result.getErrNo()==0){
                                Log.d("loginRes", gson.toJson(loginRes) + "");
                                new REFERENCE_APP(LoginActivity.this).setValue("loginRes",gson.toJson(loginRes));
                                go_main();
                            }else Tools.dialog(LoginActivity.this, "Message Error", loginRes.result.getErrMsg());

                        }else {
                            Tools.isCheckResponse(response,getBaseContext(), "", "", 0);
                            call.cancel();
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<LoginRes> call, @NonNull Throwable t) {
                        Tools.sh_load();
                        Tools.dialog(LoginActivity.this, "Message Error", t.getMessage());
                    }
                });

            } catch (Exception e) {
                Tools.sh_load();
            }
        }
    }

    public void go_main() {
        Intent i = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);
    }

    public void goMain(View view) {
        go_main();
    }
}