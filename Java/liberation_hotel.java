package com.example.bengali;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.bengali.databinding.ActivityLiberationHotelBinding;

import java.util.ArrayList;

public class liberation_hotel extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityLiberationHotelBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLiberationHotelBinding.inflate(getLayoutInflater());
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
        LatLng sydney = new LatLng(23.911461241489327, 90.31777425361827);
        mMap.addMarker(new MarkerOptions().position(sydney).title("মমতা পল্লী হোটেল এন্ড রেস্টুরেন্ট"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng sydney2 = new LatLng(23.944632479216118, 90.2711841073796);
        mMap.addMarker(new MarkerOptions().position(sydney2).title("তামান রয়াল"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney2));

        LatLng sydney3 = new LatLng(23.84896824409571, 90.41905254621625);
        mMap.addMarker(new MarkerOptions().position(sydney3).title("লা মেরিডিয়ান ঢাকা"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney3));

        LatLng sydney4 = new LatLng(23.802487441529088, 90.40577239892421);
        mMap.addMarker(new MarkerOptions().position(sydney4).title("হোটেল সারিনা ঢাকা"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney4));


    }
}