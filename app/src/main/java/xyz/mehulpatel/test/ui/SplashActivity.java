package xyz.mehulpatel.test.ui;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import xyz.mehulpatel.test.R;

public class SplashActivity extends AppCompatActivity {

    private static final int READ_CONTACT_PERMISSION_REQUEST_CODE = 76;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },5*1000);
    }

}
