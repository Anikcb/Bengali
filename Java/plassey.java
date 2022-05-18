package com.example.bengali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class plassey extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plassey);

        b1 = (Button) findViewById(R.id.button15);
        b2 = (Button) findViewById(R.id.button16);
        b3 = (Button) findViewById(R.id.button17);
        b4 = (Button) findViewById(R.id.button18);
        b5 = (Button) findViewById(R.id.button19);


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
            case R.id.button15:
                intent = new Intent(this, plassey_history.class);
                startActivity(intent);
                break;

            case R.id.button16:
                intent = new Intent(this, plassey_info.class);
                startActivity(intent);
                break;

            case R.id.button17:
                intent = new Intent(this, plassey_gallery.class);
                startActivity(intent);
                break;

            case R.id.button18:
                intent = new Intent(this,plassey_map.class);
                startActivity(intent);
                break;

            case R.id.button19:
                intent = new Intent(this, plassey_hotels.class);
                startActivity(intent);
                break;
        }
    }
}