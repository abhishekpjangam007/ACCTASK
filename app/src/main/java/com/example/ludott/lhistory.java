package com.example.ludott;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;

public class lhistory extends AppCompatActivity {
private ImageView bckhi;
TextView lhis;
    private String unityGameID = "4072975";
    private AdView adView;
    private Boolean testMode=true;
    private String interstatial_id="interstitial";
    ProgressDialog progressDialog;
    public InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lhistory);
        progressDialog = new ProgressDialog(this);
        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "CAROUSEL_IMG_SQUARE_APP_INSTALL#1116934268700829_1118606095200313");

        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
//                progressDialog.dismiss();
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
//                Intent intent = new Intent(lhistory.this,history.class);
//                startActivity(intent);

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
//        progressDialog = new ProgressDialog(lhistory.this);
//        progressDialog.show();
//        progressDialog.setContentView(R.layout.progress_dialog);
//        progressDialog.getWindow().setBackgroundDrawableResource(
//                android.R.color.transparent
//        );
//
//        interstitialAd.loadAd(
//                interstitialAd.buildLoadAdConfig()
//                        .withAdListener(interstitialAdListener)
//                        .build());
        /////////////////////////////////////////////////////////////////////////////////
        UnityAds.initialize(lhistory.this,unityGameID,testMode);
        IUnityAdsListener unityAdsListener = new IUnityAdsListener() {
            @Override
            public void onUnityAdsReady(String s) {

            }

            @Override
            public void onUnityAdsStart(String s) {

            }

            @Override
            public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {

            }

            @Override
            public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String s) {

            }
        };

//        UnityAds.setListener(unityAdsListener);
//        if (UnityAds.isInitialized()){
//            UnityAds.load(interstatial_id);
//
//            Handler handler = new Handler();
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//
//                }
//            },2000);
//        }else{
//            final Handler handler = new Handler();
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    UnityAds.load(interstatial_id);
//
//                    handler.postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
////                        UnityAds.load(interstatial_id);
//                            DisplayInterstitialAd();
//                        }
//                    },2000);
//                }
//            },2000);
//        }

//banner
        adView=new AdView(this,"IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();


        bckhi=findViewById(R.id.bckhis);
        final MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.click);
        bckhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(lhistory.this, history.class));
//                progressDialog = new ProgressDialog(lhistory.this);
//                progressDialog.show();
//                progressDialog.setContentView(R.layout.progress_dialog);
//                progressDialog.getWindow().setBackgroundDrawableResource(
//                        android.R.color.transparent
//                );
//
//                interstitialAd.loadAd(
//                        interstitialAd.buildLoadAdConfig()
//                                .withAdListener(interstitialAdListener)
//                                .build());


           }
        });

        lhis=findViewById(R.id.lhis);
        String para="●Ludo is a traditional board gametypically of a square shapedthat originated from India.\n" +
                "●The name Ludo came from England in 1896.\n" +
                "●In this game the players race their four pieces from start to end according to the rolls of a die.\n" +
                "●Cross and circle board game that originated in Ancient India also known as Pachisi It was created in India in the 6th century.\n" +
                "●Pachisi was played by  Mughal Emperor Jalal-ud-din Muhammad Akbar .\n" +
                "●Ludo was formed with the intention of bringing better quality, gameplay and a modern touch to a game many families already know and enjoy.\n";
        lhis.setText(para);
        lhis.setMovementMethod(new ScrollingMovementMethod());
    }
    private void DisplayInterstitialAd () {
        if (UnityAds.isReady(interstatial_id)){
            UnityAds.show(lhistory.this,interstatial_id);
        }
    }

    @Override
    public void onBackPressed() {

                Intent intent = new Intent(lhistory.this, history.class);
                startActivity(intent);

            }

}