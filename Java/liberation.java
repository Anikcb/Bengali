package com.example.bengali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class liberation extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liberation);

        b1 = (Button) findViewById(R.id.button10);
        b2 = (Button) findViewById(R.id.button11);
        b3 = (Button) findViewById(R.id.button12);
        b4 = (Button) findViewById(R.id.button13);
        b5 = (Button) findViewById(R.id.button14);


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
            case R.id.button10:
                intent = new Intent(this, liberation_history.class);
                startActivity(intent);
                break;

            case R.id.button11:
                intent = new Intent(this, liberation_info.class);
                startActivity(intent);
                break;

            case R.id.button12:
                intent = new Intent(this, liberation_gallery.class);
                startActivity(intent);
                break;

            case R.id.button13:
                intent = new Intent(this, liberation_map.class);
                startActivity(intent);
                break;

            case R.id.button14:
                intent = new Intent(this, liberation_hotel.class);
                startActivity(intent);
                break;
        }
    }
}