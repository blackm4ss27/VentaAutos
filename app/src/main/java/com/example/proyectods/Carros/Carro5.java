package com.example.proyectods.Carros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proyectods.R;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class Carro5 extends AppCompatActivity {
    private List<CarouselItem> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro5);
        ImageCarousel carousel = findViewById(R.id.carousel);
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/688270/688270_5769693.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/688270/688270_3412754.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/688270/688270_3726503.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/688270/688270_9819162.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/688270/688270_5069729.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/688270/688270_6765845.jpg?20220607010900"));
        carousel.addData(list);
    }
}