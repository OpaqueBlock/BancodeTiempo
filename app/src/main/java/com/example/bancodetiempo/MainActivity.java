package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goRegister(View view) {
        setContentView(R.layout.content_test);
    }
}