package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnKmMt_prog = (Button) findViewById(R.id.btnKmMt);
        Button btnMtKm_prog = (Button) findViewById(R.id.btnMtKm);


        btnKmMt_prog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View  v){
                Intent intent = new Intent(MainActivity.this, KmM.class);
                startActivity(intent);
            }
        });

        btnMtKm_prog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View  v){
                Intent intent = new Intent(MainActivity.this, MKm.class);
                startActivity(intent);
            }
        });




    }
}