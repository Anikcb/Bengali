package com.example.bengali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class language extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);


        b1 = (Button) findViewById(R.id.button20);
        b2 = (Button) findViewById(R.id.button21);
        b3 = (Button) findViewById(R.id.button22);
        b4 = (Button) findViewById(R.id.button23);
        b5 = (Button) findViewById(R.id.button24);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2(view);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2(view);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2(view);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2(view);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2(view);
            }
        });
    }

    public void openActivity2(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.button20:
                intent = new Intent(this, language_history.class);
                startActivity(intent);
                break;

            case R.id.button21:
                intent = new Intent(this, language_info.class);
                startActivity(intent);
                break;

            case R.id.button22:
                intent = new Intent(this, language_gallery.class);
                startActivity(intent);
                break;

            case R.id.button23:
                intent = new Intent(this, language_map.class);
                startActivity(intent);
                break;

            case R.id.button24:
                intent = new Intent(this, language_hotels.class);
                startActivity(intent);
                break;
        }
    }
}