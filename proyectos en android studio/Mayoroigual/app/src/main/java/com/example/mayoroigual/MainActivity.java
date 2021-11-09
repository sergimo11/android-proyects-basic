package com.example.mayoroigual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//declaramos la variables
    EditText valor1,valor2,Resumen;
    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //lamar alos identificadores
        //inputs
        valor1=findViewById(R.id.valor1);
        valor2=findViewById(R.id.valor2);
        Resumen=findViewById(R.id.Resumen);
        //botones
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);

        //ejecutando el evento verificar

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2;
                num1=valor1.getText().toString();
                num2=valor2.getText().toString();
             int a=Integer.parseInt(num1);
                     int b=Integer.parseInt(num2);

                if(a==b){
                    Resumen.setText("LOS NUMEROS INGRESADOS SON IGUALES");
                }else {
                    //mayor
                    if (a > b) {
                        Resumen.setText("EL VALOR(A)= " + a + " ES EL MAYOR DE LOS NUMEROS INGRESADOS");
                    } else {
                        Resumen.setText("EL VALOR(B)= " + b + " ES EL MAYOR DE LOS NUMEROS INGRESADOS ");
                    }
                }


            }
        });
        //evento borrar
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1.setText("");
                valor2.setText("");
                Resumen.setText("");
                valor1.requestFocus();
            }
        });
    }

}