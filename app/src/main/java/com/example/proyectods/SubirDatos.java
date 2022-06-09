package com.example.proyectods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SubirDatos extends AppCompatActivity {
    private Spinner spinner1,spinner2,spinner3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subir_datos);
        spinner1=(Spinner) findViewById(R.id.spinner);
        spinner2=(Spinner) findViewById(R.id.spinner2);
        spinner3=(Spinner) findViewById(R.id.spinner3);

        String[] marca ={"Toyota","Mercedez-Benz","Chevrolett","Renault","Ford","Hyunday"};
        String[] categoria ={"Sedan","Coupé","Hatchback","Suv","Camioneta","Deportivo"};
        String[] tipTransm ={"Mecánica","Semi-Automatico","Automatico"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.spinner,marca);
        spinner1.setAdapter(adapter);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this, R.layout.spinner,categoria);
        spinner2.setAdapter(adapter2);
        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(this, R.layout.spinner,tipTransm);
        spinner3.setAdapter(adapter3);
    }
    public void Publicar (View view){
        Toast.makeText(this, "Todos los datos se subieron correctamente", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent( SubirDatos.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void Cancelar(View view){
        Intent intent = new Intent( SubirDatos.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}