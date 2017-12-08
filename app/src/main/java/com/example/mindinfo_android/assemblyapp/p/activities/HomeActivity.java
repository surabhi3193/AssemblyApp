package com.example.mindinfo_android.assemblyapp.p.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mindinfo_android.assemblyapp.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout news_btn, msg_btn, congress_btn, kota_btn, social_btn, speech_btn, back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        news_btn = (LinearLayout) findViewById(R.id.news_btn);
        msg_btn = (LinearLayout) findViewById(R.id.msg_btn);
        congress_btn = (LinearLayout) findViewById(R.id.congress_news_btn);
        kota_btn = (LinearLayout) findViewById(R.id.kota_news_btn);
        social_btn = (LinearLayout) findViewById(R.id.social_btn);
        speech_btn = (LinearLayout) findViewById(R.id.speech_btn);
        back_btn = (LinearLayout) findViewById(R.id.back_btn);
        LinearLayout login_btn = (LinearLayout) findViewById(R.id.login_btn);
        TextView headerTV = (TextView) findViewById(R.id.headerTV);

        headerTV.setText("SHIVKANT NANDWANA");
        news_btn.setOnClickListener(this);
        msg_btn.setOnClickListener(this);
        congress_btn.setOnClickListener(this);
        kota_btn.setOnClickListener(this);
        speech_btn.setOnClickListener(this);
        social_btn.setOnClickListener(this);
        back_btn.setVisibility(View.GONE);

        login_btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.news_btn:
                startActivity(new Intent(getApplicationContext(), newsActivity.class));
                break;

            case R.id.congress_news_btn:
                startActivity(new Intent(getApplicationContext(), CongressActivity.class));
                break;

            case R.id.speech_btn:
                startActivity(new Intent(getApplicationContext(), SpeechActivity.class));
                break;
            case R.id.kota_news_btn:
                startActivity(new Intent(getApplicationContext(), KotaActivity.class));
                break;

                case R.id.social_btn:
                startActivity(new Intent(getApplicationContext(), SocialActivity.class));
                break;

                case R.id.msg_btn:
                    Toast.makeText(getApplicationContext(),"Page Under Development !",Toast.LENGTH_LONG).show();
                break;

                case R.id.login_btn:
                    startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                break;

        }

    }
}
