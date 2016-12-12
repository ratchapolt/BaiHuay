package com.example.baihuay;

import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);


        String twoDigits = getIntent().getStringExtra("two");
        String threeDigits = getIntent().getStringExtra("three");


        if (twoDigits != null && threeDigits == null) {
            tv2.setText(new DecimalFormat("00").format(Integer.parseInt(twoDigits)));
        }else if(threeDigits != null && twoDigits == null) {
            tv1.setText("à¹€à¸¥à¸‚à¸—à¹‰à¸²à¸¢ 3 à¸•à¸±à¸§");
            tv2.setText(new DecimalFormat("000").format(Integer.parseInt(threeDigits)));
        }

    }
}
