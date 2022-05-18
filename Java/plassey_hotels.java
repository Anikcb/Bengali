package com.example.bengali;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.bengali.databinding.ActivityPlasseyHotelsBinding;

public class plassey_hotels extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityPlasseyHotelsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPlasseyHotelsBinding.inflate(getLayoutInflater());
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

        // Add a marker in Sydney and move the camera
        LatLng sydney1 = new LatLng(23.702843146656825, 90.4170040176694);
        mMap.addMarker(new MarkerOptions().position(sydney1).title("The Grand Regency"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney1));

        LatLng sydney2 = new LatLng(23.722291788360437, 90.41360529602751);
        mMap.addMarker(new MarkerOptions().position(sydney2).title("Hotel Seven Star Res"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney2));

        LatLng sydney3 = new LatLng(23.73351511301144, 90.40874997939625);
        mMap.addMarker(new MarkerOptions().position(sydney3).title("Asia Hotel & Resorts"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney3));
    }
}