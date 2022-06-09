package com.example.proyectods.Carros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proyectods.R;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class Carro4 extends AppCompatActivity {
    private List<CarouselItem> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro4);
        ImageCarousel carousel = findViewById(R.id.carousel);
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/538231/538231_8619928.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/538231/538231_8896897.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/538231/538231_7704569.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/538231/538231_2308433.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/538231/538231_8807831.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/538231/538231_5214847.jpg?20220607010900"));
        carousel.addData(list);
    }
}