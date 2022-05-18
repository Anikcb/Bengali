package com.example.bengali;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.bengali.databinding.ActivityLanguageHotelsBinding;

public class language_hotels extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityLanguageHotelsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLanguageHotelsBinding.inflate(getLayoutInflater());
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
        LatLng sydney = new LatLng(23.731294122051892, 90.40889873960253);
        mMap.addMarker(new MarkerOptions().position(sydney).title("এশিয়া হোটেল অ্যান্ড রিসোর্টস"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng sydney2 = new LatLng(23.73215842322492, 90.415164379452);
        mMap.addMarker(new MarkerOptions().position(sydney2).title("হোটেল রহমানিয়া ইন্টারন্যাশনাল"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney2));

        LatLng sydney3 = new LatLng(23.732511999325453, 90.40967121574835);
        mMap.addMarker(new MarkerOptions().position(sydney3).title("ফারস হোটেল এন্ড রিসোর্টস"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney3));

        LatLng sydney4 = new LatLng(23.736126277773273, 90.41087284530853);
        mMap.addMarker(new MarkerOptions().position(sydney4).title("হোটেল অরনেট"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney4));
    }
}