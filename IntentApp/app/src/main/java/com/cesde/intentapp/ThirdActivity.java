package com.cesde.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    EditText inputCorreo;
    EditText inputPass;
    Button  btnIngresar;
    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnIngresar = findViewById(R.id.btn_iniciar);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarSesion();
            }
        });
    }


    public void iniciarSesion(){

        String mail = "pepito@mail.com";
        String password = "xyz123";
        inputCorreo = findViewById(R.id.input_correo_inicio);
        inputPass = findViewById(R.id.input_password_inicio);
        String inputMail = String.valueOf(inputCorreo.getText());
        String inputPassword = String.valueOf(inputPass.getText());

        if(mail.equals(inputMail) && password.equals(inputPassword)){

            Intent intent = new Intent(this,FourthActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Valide sus credenciales",
                    Toast.LENGTH_LONG).show();
        }
    }
}