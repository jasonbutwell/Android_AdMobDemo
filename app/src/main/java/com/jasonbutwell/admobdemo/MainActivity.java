package com.jasonbutwell.admobdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    // Note as stated by Google:

    // It is against AdMob policy to click on your own live ads. During development and testing, use only test ads.
    // If you do need to render live ads before launch, avoid clicking on them. If you click on live ads, your AdMob account may be suspended.

    // For more info on Admob and the required set up process please refer to this URL:
    // https://firebase.google.com/docs/admob/android/quick-start

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ad Initialise code to be called first from within the main activity onCreate() method

        AdView adView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }
}
