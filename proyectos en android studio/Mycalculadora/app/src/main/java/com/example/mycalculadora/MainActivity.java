package com.example.mycalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button una_suma;
    Button una_resta;
    Button una_multiplicacion;
    Button una_division;
    Button nuevo;
    EditText numero1,numero2,resumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         //BOTONES
        una_suma=findViewById(R.id.button);
        nuevo=findViewById(R.id.button2);
        una_resta=findViewById(R.id.button3);
        una_multiplicacion=findViewById(R.id.button4);
        una_division=findViewById(R.id.button5);
        //INPUTS
        numero1=findViewById(R.id.numero1);
        numero2=findViewById(R.id.numero2);
        resumen=findViewById(R.id.resumen);

      //evento suma
        una_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               resumen.setText( una_suma( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()) )+"");
            }
        });

        //evento resta
        una_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resumen.setText( una_resta( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()) )+"");
            }
        });
        //evento multiplicacion
        una_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resumen.setText( una_multiplicacion( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()) )+"");
            }
        });
        //evento divicion
        una_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resumen.setText( una_divicion( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()) )+"");
            }
        });
        //evento nuevo
        nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //evento para el boton nuevo

                numero1.setText("");
                numero2.setText("");
                resumen.setText("");
                numero1.requestFocus();
            }
        });

    }
    public int una_suma(int a, int b){
        return a+b;
    }
    public int una_resta(int a, int b){
        return a-b;
    }
    public int una_multiplicacion(int a, int b){
        return a*b;
    }
    public double una_divicion(int a, int b){
        return a/b;
    }


}