package com.cesde.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnRegistro;
    Button btnInicio;


    //__________________________________________________//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegistro = findViewById(R.id.btn_registro);
        btnInicio = findViewById(R.id.btn_inicio);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAlRegistro();
            }
        });

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAlInicio();
            }
        });
    }

    //_______________________________________________//

    public void irAlRegistro(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    public void irAlInicio(){
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }

}