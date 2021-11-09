package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText txtApellidos,txtNombres,txtEdad,txtResuen;

    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtApellidos=findViewById(R.id.txtApellidos);
        txtNombres=findViewById(R.id.txtNombres);
        txtEdad=findViewById(R.id.txtEdad);
        txtResuen=findViewById(R.id.txtResuen);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //evento para registrar
            String mensaje="";
            mensaje ="Datos:"+ txtApellidos.getText()+", " + txtNombres.getText()+"edad "+
                    txtEdad.getText();
            txtResuen.setText(mensaje);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //evento para el boton nuevo

                txtApellidos.setText("");
                txtNombres.setText("");
                txtEdad.setText("");
                txtResuen.setText("");
                txtApellidos.requestFocus();
            }
        });
    }
}