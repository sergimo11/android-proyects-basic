package com.example.condicionales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaramos variables
    EditText txtApellios,txtNombre,txtEdad,txtResumen;
    Button btnVerificar,btnBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Asociar los controles de xml o java
        txtApellios=findViewById(R.id.txtApellidos);
        txtNombre=findViewById(R.id.txtNombres);
        txtEdad=findViewById(R.id.txtEdad);
        txtResumen=findViewById(R.id.txtResumen);
        btnVerificar=findViewById(R.id.btnVerificar);
        btnBorrar=findViewById(R.id.btnBorrar);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Codigo para Verificar
                int edad;
                //Verificar que la caja de texto edad no este vacia
                if(txtEdad.getText().equals(""))
                {
                    //Mensaje emergente
                    Toast.makeText(getApplicationContext(),"Falta Edad",Toast.LENGTH_SHORT).show();
                    txtEdad.requestFocus();
                }
                else{
                    edad = Integer.parseInt(txtEdad.getText()+"") ;
                    //Verificamos si es mayor o menor de edad
                    if(edad>=18){
                        txtResumen.setText("MAYOR DE EDAD");
                    }
                    else{
                        txtResumen.setText("MENOR DE EDAD");
                    }
                }
            }
        });


        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}