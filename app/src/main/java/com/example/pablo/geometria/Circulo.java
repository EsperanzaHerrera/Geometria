package com.example.pablo.geometria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Circulo extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText etArea;
    private EditText etPerim;
    private Button btnCalcular;

    private int rarea;
    private int rperim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circulo);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);

        etArea = (EditText) findViewById(R.id.etArea);
        etPerim = (EditText) findViewById(R.id.etPerim);

        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int lado1 = Integer.parseInt(et1.getText().toString());
                int lado2 = Integer.parseInt(et2.getText().toString());
                int lado3 = Integer.parseInt(et3.getText().toString());
                int lado4 = Integer.parseInt(et4.getText().toString());

                rarea = lado1 * lado2;
                rperim = lado1 + lado2 + lado3 + lado4;

                etArea.setText(Integer.toString(rarea));
                etPerim.setText(Integer.toString(rperim));

            }
        });
    }
}
