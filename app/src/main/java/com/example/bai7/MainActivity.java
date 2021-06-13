package com.example.bai7;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login_btn(View view) {
        EditText email = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText pass= (EditText) findViewById(R.id.editTextTextPersonPass);

        if (email.getText().toString().equals("admin") && pass.getText().toString().equals("admin123")) {
            Intent intent = new Intent(MainActivity.this,main1.class);
            startActivity(intent);
        }
        if (email.getText().toString().equals("truong") && pass.getText().toString().equals("truong123")) {
            Intent intent = new Intent(MainActivity.this,main1.class);
            startActivity(intent);
        }
    }
}