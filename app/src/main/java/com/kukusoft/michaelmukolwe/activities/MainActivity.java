package com.kukusoft.michaelmukolwe.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button img3;
    private Button img1;
    private Button img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img3 = (Button)(findViewById(R.id.btn_activity));
        img1 = (Button)(findViewById(R.id.btn_activity_1));
        img2 = (Button)(findViewById(R.id.btn_activity_2));

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchImg3Activity();
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchImg1Activity();
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchImg2Activity();
            }
        });
    }

    private void launchImg3Activity(){
        Intent intent = new Intent(this, img3Activity.class);
        startActivity(intent);
    }
    private void launchImg1Activity(){
        Intent intent = new Intent(this, img1Activity.class);
        startActivity(intent);
    }
    private void launchImg2Activity(){
        Intent intent = new Intent(this, img2Activity.class);
        startActivity(intent);
    }
}
