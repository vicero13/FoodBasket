package com.vicero13.foodbasket.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.vicero13.foodbasket.R;
import com.vicero13.foodbasket.presenters.LoginPresenter;


public class LoginActivity extends AppCompatActivity {

    Button btnSignIn;
    EditText etEmail, etPassword;
    TextView tvSignUp;
    LoginPresenter loginPresenter;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        //Where i can replace it???
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        tvSignUp = (TextView) findViewById(R.id.tvSign_up);
        loginPresenter = new LoginPresenter();

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.onLogin(etEmail.getText().toString(), etPassword.getText().toString());

                if(loginPresenter.isSuccessfulLogin()){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Snackbar.make(v, "Incorrect login or password", Snackbar.LENGTH_LONG).show();
                }
            }
        });

        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    
}
