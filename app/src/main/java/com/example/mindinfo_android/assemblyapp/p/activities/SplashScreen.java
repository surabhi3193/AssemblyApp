package com.example.mindinfo_android.assemblyapp.p.activities;

import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.mindinfo_android.assemblyapp.R;

public class SplashScreen extends AppCompatActivity {


    String login = "";
    Dialog dialog;
    static boolean ad = true;
    protected Context context;
    private static final int PREFERENCE_PRIVATE_MODE = 0;

    Boolean isInternetPresent = false;
    static String a;
    //  ImageLoader imageLoader;


    private static final int REQUEST_CODE_PERMISSION = 2;
    String[] mPermission = {Manifest.permission.GET_ACCOUNTS,
            Manifest.permission.INTERNET, Manifest.permission.ACCESS_NETWORK_STATE,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
            context = this;
            super.onStart();


                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                                Intent intent = new Intent(SplashScreen.this, HomeActivity.class);
                                startActivity(intent);
                                finish();

                        }
                    }, 3000);

        }

        // **************** dailog for network connection ****************** //

}
