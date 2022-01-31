package com.example.ambreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button reg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reg=(Button) findViewById(R.id.reg_btn);
        reg.setOnclickListener(new View.OnclickListener(){
            @Override
                    Public void onClick(View view){
                intent i=new Intent(packagecontext MainActivity.this,reg.class);
                startActivity(i);
            }
        });
    }
}