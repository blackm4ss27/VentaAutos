package com.example.proyectods;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.proyectods.databinding.ActivityMapa2Binding;

public class Mapa extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private ActivityMapa2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapa2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng Cusco = new LatLng(-13.5170887,-71.9785356);
        mMap.addMarker(new MarkerOptions().position(Cusco).title("Marker in Cusco").snippet("Ciudad fundada en 1822"));
        mMap.setOnMarkerClickListener(this);
        LatLng Saylla = new LatLng(-13.5702475,-71.8271365);
        mMap.addMarker(new MarkerOptions().position(Saylla).title("Estas en venta de autos").snippet("En este sitio puedes encontrar autos que se venden cerca de tu localidad").icon(BitmapDescriptorFactory.fromResource(R.drawable.saylla)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Cusco,10));
    }
    public boolean onMarkerClick(Marker marker) {
        String lat,lng;
        lat = Double.toString(marker.getPosition().latitude);
        lng = Double.toString(marker.getPosition().longitude);

        Toast.makeText(this, "Latitud : "+lat + "," +"Longitud: "+ lng,Toast.LENGTH_SHORT).show();
        return false;
    }
}