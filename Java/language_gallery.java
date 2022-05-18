package com.example.bengali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class language_gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_gallery);

        ImageSlider imageSlider = findViewById(R.id.slider3);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://upload.wikimedia.org/wikipedia/commons/a/a1/Bengali_language_movement_in_1952.jpg"));
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpVq6Fhnp_HKEgcXfNowPmULi5B7YmNClSI-FfAXP5IUpy3A0uoDGRlw-qwbm5QuVj25Q&usqp=CAU"));
        slideModels.add(new SlideModel("https://www.closeupfilmcentre.com/index.php/download_file/view_inline/2195/"));
        slideModels.add(new SlideModel("https://www.daily-sun.com/assets/news_images/2022/02/20/LanguageMovement-daily-sun-1.jpg"));
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToVaVkzm0y7CoVSIhWDK-MsNYa0u6byqNfQo4TJ0Aqx_4uS1AuI38T3SMyzJO_je80o0w&usqp=CAU"));
        imageSlider.setImageList(slideModels,true);
    }
}