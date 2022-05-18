package com.example.bengali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class plassey_gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plassey_gallery);

        ImageSlider imageSlider = findViewById(R.id.slider2);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://images.tuckdb.org/postcards/images/000/110/780/original/2011_07_28_12_22_10.jpg"));
        slideModels.add(new SlideModel("https://akm-img-a-in.tosshub.com/indiatoday/mi-647_062316012617.jpg?TA_G176sbDezwO2h_6Ot8KBIGrzjurSk&size=1200:675"));
        slideModels.add(new SlideModel("https://www.britishbattles.com/wp-content/uploads/2019/03/richard-simkin-the-39th-regiment-at-plassey-23rd-june-1757.jpg"));
        slideModels.add(new SlideModel("https://smedia2.intoday.in/indiatoday/images/stories/2017June/battle-of-plassey-1_062317111628.jpg"));
        slideModels.add(new SlideModel("https://www.nam.ac.uk/sites/default/files/styles/related_content/public/2017-06/173414_slide.jpg?itok=g-VmRhh6"));
        imageSlider.setImageList(slideModels,true);
    }
}