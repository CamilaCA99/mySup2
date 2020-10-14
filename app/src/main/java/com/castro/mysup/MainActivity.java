package com.castro.mysup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtEmail;
    private EditText txtContrasena;
    private Button btnIniciar;
    private TextView btnContrasena;
    private Button btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = findViewById(R.id.txtEmail);
        txtContrasena = findViewById(R.id.txtContrasena);
        btnIniciar = findViewById(R.id.btnIniciar);
        btnContrasena = findViewById(R.id.btnContrasena);
        btnRegistro = findViewById(R.id.btnRegistro);

        btnContrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentContrasena = new Intent(MainActivity.this,cambiarContrasena.class);
                startActivity(intentContrasena);
            }
        });
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegistro = new Intent(MainActivity.this,registro.class);
                startActivity(intentRegistro);
            }
        });
    }
}