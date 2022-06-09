package com.example.proyectods.Carros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proyectods.R;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class Carro6 extends AppCompatActivity {
    private List<CarouselItem> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro6);
        ImageCarousel carousel = findViewById(R.id.carousel);
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/381545/381545_1405486.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/381545/381545_5716324.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/381545/381545_3225990.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/381545/381545_6275361.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/381545/381545_7555090.jpg?20220607010900"));
        list.add(new CarouselItem("https://cde.neoauto.pe/autos_usados/800x600/381545/381545_1552967.jpg?20220607010900"));
        carousel.addData(list);
    }
}