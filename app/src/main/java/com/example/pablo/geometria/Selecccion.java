package com.example.pablo.geometria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Selecccion extends AppCompatActivity {

    Button Cuadrado;
    Button Rectangulo;
    Button Triangulos;
    Button Rombo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selecccion);

        Cuadrado = (Button) findViewById(R.id.btnCuadrado);
        Rectangulo = (Button) findViewById(R.id.btnRectangulo);
        Triangulos = (Button) findViewById(R.id.btnTriangulos);
        Rombo = (Button) findViewById(R.id.btnRombo);


        Cuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Cuadrado = new Intent(Selecccion.this, Cuadrado.class);
                startActivity(Cuadrado);
            }
        });


        Rectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Rectangulo = new Intent(Selecccion.this, Rectangulo.class);
                startActivity(Rectangulo);

            }
        });


        Triangulos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Triangulos = new Intent(Selecccion.this, Triangulos.class);
                startActivity(Triangulos);
            }
        });


        Rombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Rombo = new Intent(Selecccion.this, Rombo.class);
                startActivity(Rombo);
            }
        });


    }
}
