package com.example.bengali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class heros extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heros);

        b1 = (Button) findViewById(R.id.button3);
        b2 = (Button) findViewById(R.id.button4);
        b3 = (Button) findViewById(R.id.button5);
        b4 = (Button) findViewById(R.id.button6);
        b5 = (Button) findViewById(R.id.button7);
        b6 = (Button) findViewById(R.id.button8);
        b7 = (Button) findViewById(R.id.button9);

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

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2(view);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2(view);
            }
        });
    }

    public void openActivity2(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.button3:
                intent = new Intent(this, bangabandhu.class);
                startActivity(intent);
                break;

            case R.id.button4:
                intent = new Intent(this, rabindranath.class);
                startActivity(intent);
                break;

            case R.id.button5:
                intent = new Intent(this, kazinazrul.class);
                startActivity(intent);
                break;

            case R.id.button6:
                intent = new Intent(this, siraj.class);
                startActivity(intent);
                break;

            case R.id.button7:
                intent = new Intent(this, babur.class);
                startActivity(intent);
                break;

            case R.id.button8:
                intent = new Intent(this, rofiq.class);
                startActivity(intent);
                break;

            case R.id.button9:
                intent = new Intent(this, jobbar.class);
                startActivity(intent);
                break;
        }

    }
}

