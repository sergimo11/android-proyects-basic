package com.example.calculandoelpromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText NOMBRE,APELLIDO,NOTA1,NOTA2,Resumen;
        Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //imputs

        NOMBRE=findViewById(R.id.NOMBRE);
        APELLIDO=findViewById(R.id.APELLIDO);
        NOTA1=findViewById(R.id.NOTA1);
        NOTA2=findViewById(R.id.NOTA2);
        Resumen=findViewById(R.id.Resumen);

        //botones

        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //NOMBRE Y APELLIDO
                String mensaje;
                mensaje = "EL ALUMNO:" + NOMBRE.getText() + " " + APELLIDO.getText();

                //PROMEDIO
                String n1, n2;
                n1 = NOTA1.getText().toString();
                n2 = NOTA2.getText().toString();
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int promedio = (a + b) / 2;

                if (promedio>=11 && promedio<=20) {
                    Resumen.setText(mensaje + " SU PROMEDIO ES : " + promedio + " USTD. ESTA APROBADO");
                } else if (promedio>=0 && promedio <=10 ) {
                    Resumen.setText(mensaje + " SU PROMEDIO ES : " + promedio + " USTD. ESTA DESAPROBADO");
                } else {
                    Resumen.setText("LAS NOTAS INGRESADAS NO SON VALIDAS PARA PROMEDIAR");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NOMBRE.setText("");
                APELLIDO.setText("");
                NOTA1.setText("");
                NOTA2.setText("");
                Resumen.setText("");
                NOMBRE.requestFocus();
            }
        });

    }

 }

