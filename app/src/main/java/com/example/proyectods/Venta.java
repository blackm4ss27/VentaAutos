package com.example.proyectods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.proyectods.Adapters.VizualizarAdapter;
import com.example.proyectods.Adapters.VizualizarItems;
import com.example.proyectods.Carros.Carro1;
import com.example.proyectods.Carros.Carro2;
import com.example.proyectods.Carros.Carro3;
import com.example.proyectods.Carros.Carro4;
import com.example.proyectods.Carros.Carro5;
import com.example.proyectods.Carros.Carro6;

import java.util.ArrayList;

public class Venta extends AppCompatActivity {

    VizualizarAdapter adapter;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);


        lista = findViewById(R.id.listDestinosBuscar);

        adapter = new VizualizarAdapter(this,getDatos());

        lista.setAdapter(adapter);


        // AgenciasAdaptadores
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // La posición donde se hace clic en el elemento de lista se obtiene de la
                // la posición de parámetro de la vista de lista de Android
                VizualizarItems.vizualizarItems item = (VizualizarItems.vizualizarItems) adapterView.getItemAtPosition(position);
                Intent intent;
                if(item.getId() == "1" ){
                    intent = new Intent(getApplicationContext(), Carro1.class);
                }else if(item.getId() == "2" ){
                    intent = new Intent(getApplicationContext(), Carro2.class);
                }else if(item.getId() == "3" ){
                    intent = new Intent(getApplicationContext(), Carro3.class);
                }else if(item.getId() == "4" ){
                    intent = new Intent(getApplicationContext(), Carro4.class);
                }else if(item.getId() == "5" ){
                    intent = new Intent(getApplicationContext(), Carro5.class);
                }else if(item.getId() == "6" ){
                    intent = new Intent(getApplicationContext(), Carro6.class);
                }else {
                    intent = new Intent(getApplicationContext(), Venta.class);}

                intent.putExtra("id", item.getId());
                startActivity(intent);

            }
        });

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "click Largo " + i, Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
    //metodo para retornar o recibir metodos

    private ArrayList<VizualizarItems.vizualizarItems> getDatos() {
        return VizualizarItems.ArregloLista();
    }

    // evento se repite n veces , se usa varias vecxes
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_buscar_destinos, menu);
        MenuItem item = menu.findItem(R.id.menu_search);
        SearchView searchView = (SearchView) item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}