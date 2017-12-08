package com.example.mindinfo_android.assemblyapp.p.activities;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.mindinfo_android.assemblyapp.R;

public class KotaActivity extends AppCompatActivity {
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speech);
        final Activity activity =KotaActivity.this;
        WebView webview = (WebView)findViewById(R.id.webview);
        TextView headerTV = (TextView)findViewById(R.id.headerTV);
        LinearLayout back_btn = (LinearLayout) findViewById(R.id.back_btn);
        LinearLayout login_btn = (LinearLayout) findViewById(R.id.login_btn);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        login_btn.setVisibility(View.GONE);
        headerTV.setText("Kota News");
        webview.loadUrl("https://www.bhaskar.com/rajasthan/kota/");
        webview.setWebViewClient(new myWebClient());
        webview.getSettings().setJavaScriptEnabled(true);

        webview.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                activity.setTitle("Loading...");
                activity.setProgress(progress * 100);

                if(progress == 100)
                    activity.setTitle(R.string.app_name);
            }
        });



        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });

    }
    public  class myWebClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
            progressBar.setVisibility(View.VISIBLE);
            view.loadUrl(url);
            return true;

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);

            progressBar.setVisibility(View.GONE);
        }
    }

}
