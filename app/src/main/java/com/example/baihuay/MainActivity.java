package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button btn_2number = (Button) findViewById(R.id.btn_2number);
            Button btn_3number = (Button) findViewById(R.id.btn_3number);

            btn_2number.setOnClickListener(this);
            btn_3number.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btn_2number:
                    String twoDigists = String.valueOf(Huay.getRandomTwoDigits());
                    Intent i = new Intent(this, ShowActivity.class);
                    i.putExtra("two", twoDigists);
                    startActivity(i);
                    break;
                case R.id.btn_3number:
                    String threeDigits = String.valueOf(Huay.getRandomThreeDigits());
                    Intent j = new Intent(this, ShowActivity.class);
                    j.putExtra("three", threeDigits);
                    startActivity(j);
                    break;
                default:
                    break;
            }
        }
    }


