package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    Button btnLogin;
    EditText edEmail, edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.button4);
        edEmail = findViewById(R.id.editTextTextPersonName);
        edPassword = findViewById(R.id.editTextTextPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(edEmail.getText().toString()) || TextUtils.isEmpty(edPassword.getText().toString())){
                    String message = "All inputs required ...";
                    Toast.makeText(Login.this,message,Toast.LENGTH_LONG).show();
                }else{
                    LoginRequest loginRequest = new LoginRequest();
                    loginRequest.setEmail(edEmail.getText().toString());
                    loginRequest.setPassword(edPassword.getText().toString());

                    loginUser(loginRequest);
                }
            }
        });
        Intent intent = getIntent();
        if(intent.getExtras() != null){
            LoginResponse loginResponse = (LoginResponse) intent.getSerializableExtra("data");
            Log.e("TAG","msg----------------->" + loginResponse.getLoginApproval().toString());
            if (loginResponse.getLoginApproval() == 1){
                Intent menu = new Intent(Login.this, MenuTemporal.class);
                startActivity(menu);
            }
        }
    }

    public void loginUser(LoginRequest loginRequest){
        Call<LoginResponse> loginResponseCall = ApiClient.getService().loginUser(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if(response.isSuccessful()){
                    LoginResponse loginResponse = response.body();
                    startActivity(new Intent(Login.this, Login.class).putExtra("data",loginResponse));
                    finish();
                }else{
                    String message = "An error occurred, please try again...";
                    Toast.makeText(Login.this, message,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                String message = t.getLocalizedMessage();
                Toast.makeText(Login.this, message,Toast.LENGTH_LONG).show();
            }
        });
    }
    public void goValidate(View view){
        setContentView(R.layout.activity_pagina_verificacion);
    }
    public void goFavorite(View view){
        setContentView(R.layout.activity_pagina_favoritos);
    }

    public void goInicio(View view){
        setContentView(R.layout.activity_menu_temporal);
    }

    public void goBDT(View view){
        Intent intent=new Intent(Login.this, PaginaPrincipal.class);
        startActivity(intent);
    }



}