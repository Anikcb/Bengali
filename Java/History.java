package com.example.bengali;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class History extends AppCompatActivity implements View.OnClickListener {

    public CardView c1,c2,c3,c4,c5,c6,c7,c8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        c1 = (CardView) findViewById(R.id.heros);
        c2 = (CardView) findViewById(R.id.liberation);
        c3 = (CardView) findViewById(R.id.language);
        c4 = (CardView) findViewById(R.id.separation);
        c5 = (CardView) findViewById(R.id.boxer);
        c6 = (CardView) findViewById(R.id.panipath);
        c7 = (CardView) findViewById(R.id.plassey);
        c8 = (CardView) findViewById(R.id.nobab);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.heros:
                i = new Intent(this, heros.class);
                startActivity(i);
                break;

            case R.id.liberation:
                i = new Intent(this, liberation.class);
                startActivity(i);
                break;

            case R.id.language:
                i = new Intent(this, language.class);
                startActivity(i);
                break;

            case R.id.separation:
                i = new Intent(this, separation.class);
                startActivity(i);
                break;

            case R.id.boxer:
                i = new Intent(this, boxer.class);
                startActivity(i);
                break;

            case R.id.panipath:
                i = new Intent(this, panipath.class);
                startActivity(i);
                break;

            case R.id.plassey:
                i = new Intent(this, plassey.class);
                startActivity(i);
                break;

            case R.id.nobab:
                i = new Intent(this, nobab.class);
                startActivity(i);
                break;
        }

    }
}