package com.example.proyectods.Carros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proyectods.R;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class Carro3 extends AppCompatActivity {
    private List<CarouselItem> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro3);
        ImageCarousel carousel = findViewById(R.id.carousel);
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/680011/680011_8757810.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/680011/680011_3466733.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/680011/680011_6988902.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/680011/680011_6796524.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/680011/680011_9791485.jpg?20220607010900"));
        carousel.addData(list);
    }
}