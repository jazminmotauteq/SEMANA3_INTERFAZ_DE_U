package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btEnviar(View view)
    {
        EditText txtNombre = (EditText)findViewById(R.id.txtnombre);
        EditText txtApellido = (EditText)findViewById(R.id.txtapellido);
        RadioButton rbMasc = (RadioButton) findViewById(R.id.rbmasculino);
        String genero;
        if(rbMasc.isChecked())
            genero = " Estimado";
        else
            genero = " Estimada";
        Toast.makeText(this.getApplicationContext(),
                "hola" + genero + "" + txtNombre.getText().toString()
                + "" + txtApellido.getText().toString(),
                Toast.LENGTH_LONG). show();
    }
}