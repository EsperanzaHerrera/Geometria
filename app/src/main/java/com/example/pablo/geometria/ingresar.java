package com.example.pablo.geometria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ingresar extends AppCompatActivity {

    Button Ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingresar);

        Ingresar = (Button) findViewById(R.id.btnIngresar);

        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Ingresar = new Intent(ingresar.this, Selecccion.class);
                startActivity(Ingresar);
            }
        });
    }
}
