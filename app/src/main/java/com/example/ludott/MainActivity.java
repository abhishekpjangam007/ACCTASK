package com.example.ludott;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBanners;

public class MainActivity<unityAdsListenr> extends AppCompatActivity {
     Button clkgo,clkpri;
    private Toast backToast;
    private String unityGameID = "4072975";
    private Boolean testMode=true;
    private String banner_id = "banner";
    private String interstatial_id="interstitial";
    private AdView adView;
     InterstitialAd interstitialAd;
    ProgressDialog progressDialog;
    private final String TAG=MainActivity.class.getSimpleName();

//    static class UnityInterstitialAdsListener implements IUnityAdsListener{
//
//        @Override
//        public void onUnityAdsReady(String s) {
//
//        }
//
//        @Override
//        public void onUnityAdsStart(String s) {
//
//        }
//
//        @Override
//        public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {
//
//        }
//
//        @Override
//        public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String s) {
//
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
///////////////////////////////////////////////////////////////////

        adView=new AdView(this,"IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();
//        AudienceNetworkAds.initialize(this);


        //
        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "CAROUSEL_IMG_SQUARE_APP_INSTALL#1116934268700829_1118606095200313");

        InterstitialAdListener interstitialAdListener1 = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
//                progressDialog.dismiss();
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback

            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback

            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed

                // Show the ad
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback

            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback

            }

        };
//        progressDialog = new ProgressDialog(MainActivity.this);
//        progressDialog.show();
//
//        progressDialog.setContentView(R.layout.progress_dialog);
//        progressDialog.getWindow().setBackgroundDrawableResource(
//                android.R.color.transparent
//        );
//        interstitialAd.loadAd(
//                interstitialAd.buildLoadAdConfig()
//                        .withAdListener(interstitialAdListener1)
//                        .build());








////////////////////////////////////////////////////////////////////////////////////////////////

        clkgo= (Button) findViewById(R.id.playclick);
        final loading loading = new loading(MainActivity.this);
        final MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.click);
        clkgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                interstitialAd.loadAd(
//                        interstitialAd.buildLoadAdConfig()
//                                .withAdListener(interstitialAdListener)
//                                .build());
                Intent intent=new Intent(MainActivity.this,history.class);
                startActivity(intent);
                mediaplayer.start();
            }
        });


        clkpri=findViewById(R.id.privacy);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.click);
        clkpri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent intent=new Intent(MainActivity.this,privacypolicy.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });



           }


    @Override
    public void onBackPressed() {

        {
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Closing")
                    .setMessage("Are you sure you want to Exit?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
finishAffinity();

                        }

                    })
                    .setNegativeButton("No", null)
                    .show();
        }
    }



}

