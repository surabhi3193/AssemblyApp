package com.example.mindinfo_android.assemblyapp.p.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mindinfo_android.assemblyapp.R;

public class SocialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
        TextView headerTV = (TextView) findViewById(R.id.headerTV);
        LinearLayout back_btn = (LinearLayout) findViewById(R.id.back_btn);
        LinearLayout login_btn = (LinearLayout) findViewById(R.id.login_btn);

        ImageView fb_btn = (ImageView) findViewById(R.id.fb_btn);
        ImageView twitter_btn = (ImageView) findViewById(R.id.twitter_btn);

        login_btn.setVisibility(View.GONE);
        headerTV.setText("Social Buzz");

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });


        fb_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startActivity(new Intent(getApplicationContext(),SocialPage.class));
            }
        });


        twitter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Page Unavailable !",Toast.LENGTH_LONG).show();
            }
        });

    }
}
