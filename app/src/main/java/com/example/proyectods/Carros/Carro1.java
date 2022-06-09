package com.example.proyectods.Carros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.proyectods.R;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class Carro1 extends AppCompatActivity {
    private List<CarouselItem> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro1);
        ImageCarousel carousel = findViewById(R.id.carousel);
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/663163/663163_4648425.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/663163/663163_2626514.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/663163/663163_4230103.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/663163/663163_6679545.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/663163/663163_5904730.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/663163/663163_8520227.jpg?20220607010900"));
        carousel.addData(list);
    }
}