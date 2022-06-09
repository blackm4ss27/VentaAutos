package com.example.proyectods.Adapters;

import com.example.proyectods.R;

import java.util.ArrayList;
import java.util.List;

public class VizualizarItems {
    // declaro el arreglo
    private static final List<vizualizarItems> ITEMS = new ArrayList<vizualizarItems>();
    //contenido del arreglo
    static {
        addItem(new VizualizarItems.vizualizarItems ("1","Renault Koleos 2013", R.drawable.carro1,"Camioneta Suv"));
        addItem(new VizualizarItems.vizualizarItems("2","Renault Duster 2020",R.drawable.carro2,"Camioneta Suv"));
        addItem(new VizualizarItems.vizualizarItems("3","Chery Qq 2015", R.drawable.carro3,"Hatchback"));
        addItem(new VizualizarItems.vizualizarItems("4","Mercedes Benz Cla 180 Coupe 2017", R.drawable.carro4,"Deportivo"));
        addItem(new VizualizarItems.vizualizarItems("5","Mercedes Benz C-200 2018", R.drawable.carro5,"Sedan"));
        addItem(new VizualizarItems.vizualizarItems("6","Ford Edge Sel 2017", R.drawable.carro6,"Camionetas Suv"));
    }
    //metodo que contruye el arreglo , metodo principal
    static void addItem(VizualizarItems.vizualizarItems item){
        ITEMS.add(item);
    }
    // metodo para agregar objetos
    public static ArrayList<VizualizarItems.vizualizarItems> ArregloLista (){
        ArrayList<VizualizarItems.vizualizarItems> d = new ArrayList<VizualizarItems.vizualizarItems>();
        for(VizualizarItems.vizualizarItems obj:ITEMS){
            d.add(obj);
        }
        return d;
    }
    // metodo para traer datos
    public static VizualizarItems.vizualizarItems getVizualizarItems(String id){
        for(VizualizarItems.vizualizarItems obj:ITEMS){
            if (obj.id.equals(id)){
                return obj;
            }
        }
        return ITEMS.get(1); // busqueda título
    }
    // crear arreglo
    public static class vizualizarItems {

        private String id;
        private String titulo;
        private Integer imagen;
        private String tipoCarro;

        public vizualizarItems(String id,String titulo,Integer imagen,String tipoCarro){
            this.id = id;
            this.titulo = titulo;
            this.imagen = imagen;
            this.tipoCarro = tipoCarro;
        }
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Integer getImagen() {
            return imagen;
        }

        public void setImagen(Integer imagen) {
            this.imagen = imagen;
        }

        public String getTipoCarro() {
            return tipoCarro;
        }

        public void setTipoCarro(String tipoCarro) {
            this.tipoCarro = tipoCarro;
        }
    }
}
