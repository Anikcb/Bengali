package com.example.bengali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class liberation_gallery extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liberation_gallery);

        ImageSlider imageSlider = findViewById(R.id.slider1);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://www.samakal.com/uploads/2019/12/print/photos/Untitled-15-5df5126c65270.jpg"));
        slideModels.add(new SlideModel("https://www.quizards.co/wp-content/uploads/2017/04/l-w-b-quizards.jpg"));
        slideModels.add(new SlideModel("https://samakal.com/uploads/2021/03/print/photos/Untitled-28-samakal-60450ffcd9cfb.jpg"));
        slideModels.add(new SlideModel("https://cdn.jagonews24.com/media/PhotoGalleryNew/BG/2019February/mukto-zuddo-1-20190325183158.jpg"));
        slideModels.add(new SlideModel("https://1.bp.blogspot.com/-hBwlFTtn1co/Xef2pScq8eI/AAAAAAAAAIQ/o4LEYUDwceU6t5SPEUUmQHabJ0kYHQh2ACLcBGAsYHQ/s640/liberation-war-460.jpg"));
        slideModels.add(new SlideModel("https://images.prothomalo.com/prothomalo-bangla/2021-07/e76d9dbc-9571-4866-bfbe-08c1e98daef5/picture__031_.jpg"));
        slideModels.add(new SlideModel("https://s3.amazonaws.com/somewherein/assets/images/lubdhokblog_1206532501_1-p141.jpg"));
        imageSlider.setImageList(slideModels,true);
    }
}