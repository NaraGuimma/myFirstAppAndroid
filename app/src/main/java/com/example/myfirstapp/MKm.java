package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MKm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_km);
        final EditText edtM_prog2 = (EditText) findViewById(R.id.edtM2);
        final EditText edtKm_prog2 = (EditText) findViewById(R.id.edtKm2);

        Button btnConverter_prog2  = (Button) findViewById(R.id.btnConverter2);

        btnConverter_prog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float m, km;
                m = Float.parseFloat(edtM_prog2.getText().toString());
                km = m/1000;
                edtKm_prog2.setText(String.valueOf(km));
            }
        });
    }
}