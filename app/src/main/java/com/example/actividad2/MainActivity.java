package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btEnviar(View view)
    {
        //para sacar la referencia a los controles
        EditText txtNombre = (EditText)findViewById(R.id.txtnombre);
        EditText txtApellido = (EditText)findViewById(R.id.txtapellido);
        RadioButton rbMasc = (RadioButton) findViewById(R.id.rbmasculino);
        Switch swNotificaciones = (Switch) findViewById(R.id.swalerta);
        CalendarView txtfecha = (CalendarView)findViewById(R.id.txtcalendario);
        String genero;
        String nombre;
        String apellido;
        String notificaciones;
        String  fecha;

        if(rbMasc.isChecked())
            genero = " Estimado";
        else
            genero = " Estimada";
        //para sacar la informacion de los controles
        nombre =  txtNombre.getText().toString();
        apellido =  txtApellido.getText().toString();
        notificaciones = swNotificaciones.isChecked()?"SI":"NO";
        fecha = txtfecha.toString();

        //mostrar mensaje con la informacion
        Toast.makeText(this.getApplicationContext(),
                "hola " + genero + " " +nombre
                + "" + apellido + "notificaciones " +notificaciones,
                Toast.LENGTH_LONG). show();
        //este es para habrir una actividad
        Intent intent = new Intent(MainActivity.this, actividad3.class);
        Bundle b = new Bundle();
        //para enviar la informacion a la otra actividad
        b.putString("NOMBRE", nombre);
        b.putString("APELLIDO", apellido);
        b.putString("NOTIFICACIONES", notificaciones);
        b.putString("GENERO", genero);
        b.putString("FECHA", fecha);

//Añadimos la información al intent
        intent.putExtras(b);
// Iniciamos la nueva actividad
        startActivity(intent);


    }
}