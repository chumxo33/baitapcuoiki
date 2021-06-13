package com.example.bai7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class main2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
    }

    public void quayve_btn(View view){
        Intent intent = new Intent(main2.this,main1.class);
        startActivity(intent);
    }

    public void xacnhan_btn(View view){
        Intent intent = new Intent(main2.this, main3.class);
        startActivity(intent);
    }

}
