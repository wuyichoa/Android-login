package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText userNameTxt;
    EditText passwordTxt;
    Button loginBtn;
    TextView tipsTv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);
        userNameTxt=(EditText) findViewById(R.id.userNameTxt);
        passwordTxt=(EditText) findViewById(R.id.passwordTxt);
        tipsTv=(TextView) findViewById(R.id.tipsTxt);
        loginBtn=(Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName=userNameTxt.getText().toString();
                String password=passwordTxt.getText().toString();
                if(!"admin".equals(userName)){
                    tipsTv.setText("用户名不存在!");
                    tipsTv.setVisibility(View.VISIBLE);
                    return;
                }
                if(!"1".equals(password)){
                    tipsTv.setText("密码不正确");
                    tipsTv.setVisibility(View.VISIBLE);
                    return;
                }
                if("admin".equals(userName)&&"1".equals(password)){
                    tipsTv.setText("登录成功");
                    tipsTv.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}