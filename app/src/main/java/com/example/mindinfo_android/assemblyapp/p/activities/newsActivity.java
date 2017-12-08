package com.example.mindinfo_android.assemblyapp.p.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mindinfo_android.assemblyapp.R;

public class newsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        TextView headerTV = (TextView)findViewById(R.id.headerTV);

        headerTV.setText("News / Press");
        LinearLayout   back_btn = (LinearLayout) findViewById(R.id.back_btn);
        LinearLayout login_btn = (LinearLayout) findViewById(R.id.login_btn);
        login_btn.setVisibility(View.GONE);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });
    }
}
