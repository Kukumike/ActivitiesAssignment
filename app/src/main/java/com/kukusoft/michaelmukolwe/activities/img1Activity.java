package com.kukusoft.michaelmukolwe.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class img1Activity extends AppCompatActivity {
    private Button back;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img1);
        back = (Button)(findViewById(R.id.btn_back));
        img = (ImageView)(findViewById(R.id.img_viewed));

        img.setImageResource(R.drawable.profile);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
