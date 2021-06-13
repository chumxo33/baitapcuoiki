package com.example.bai7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class main3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
    }

    public void btn_goHome(View view){
        Intent intent = new Intent(main3.this,main1.class);
        startActivity(intent);
    }
}
