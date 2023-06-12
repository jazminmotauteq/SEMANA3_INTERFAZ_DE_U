package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class actividad3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
        TextView txtSaludo = (TextView)findViewById(R.id.txtmensaje);
//Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
//Construimos el mensaje a mostrar
        txtSaludo.setText("Hola!,  " +
                bundle.getString("GENERO") +
                " \n " +
                bundle.getString("NOMBRE") +
                " " +  bundle.getString("APELLIDO") +
                " \n Recibe Notificaciones " +
                bundle.getString("NOTIFICACIONES")
                + " \n. se ha creado correctamente el contacto " +

                bundle.getString("FECHA")
        );

    }
}