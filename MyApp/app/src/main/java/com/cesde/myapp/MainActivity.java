package com.cesde.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.visualizador);
        editText = findViewById(R.id.entradaTexto);
        button = findViewById(R.id.btnEnviar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 Editable text = editText.getText();

                textView.setText(text);
            }
        });


    }
}