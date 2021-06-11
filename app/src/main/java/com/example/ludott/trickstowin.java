package com.example.ludott;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;

public class trickstowin extends AppCompatActivity {
    private ImageView backk,trks,hmtr;
    private String unityGameID = "4072975";
    private Boolean testMode=false;
    private String interstatial_id="interstitial";
    private AdView adView;
    private InterstitialAd interstitialAd;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trickstowin);
        progressDialog = new ProgressDialog(this);
        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "CAROUSEL_IMG_SQUARE_APP_INSTALL#1116934268700829_1118606095200313");

        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
                progressDialog.dismiss();
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
//

            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback

            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed

                startActivity(new Intent(trickstowin.this, rules.class));
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


//        interstitialAd.loadAd(
//                interstitialAd.buildLoadAdConfig()
//                        .withAdListener(interstitialAdListener)
//                        .build());
        ////////
        UnityAds.initialize(trickstowin.this,unityGameID,testMode);
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
        //AUDIENCE NETWORK
//        AudienceNetworkAds.initialize(this);

        adView=new AdView(this,"IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();

//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener2 = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(trickstowin.this,unityGameID,interstitialAdsListener2,testMode);
        backk=findViewById(R.id.backk);
        final MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.click);
        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//
//
                progressDialog = new ProgressDialog(trickstowin.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                interstitialAd.loadAd(
                        interstitialAd.buildLoadAdConfig()
                                .withAdListener(interstitialAdListener)
                                .build());


            }
        });
//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(trickstowin.this,unityGameID,interstitialAdsListener,testMode);
        trks=findViewById(R.id.trtw);

        final MediaPlayer mediaplayer1 = MediaPlayer.create(this,R.raw.click);
        trks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                UnityAds.show(trickstowin.this,interstatial_id);
//                UnityAds.load(interstatial_id);
                Intent intent = new Intent(trickstowin.this,tricksntips.class);
                startActivity(intent);
                mediaplayer1.start();
            }
        });
//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener1 = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(trickstowin.this,unityGameID,interstitialAdsListener1,testMode);
        hmtr=findViewById(R.id.thome);
        final MediaPlayer mediaplayer3=MediaPlayer.create(this,R.raw.click);
        hmtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
                    @Override
                    public void onInterstitialDisplayed(Ad ad) {
                        // Interstitial ad displayed callback
                        progressDialog.dismiss();
                    }

                    @Override
                    public void onInterstitialDismissed(Ad ad) {
                        // Interstitial dismissed callback

//                        progressDialog.dismiss();
                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        // Ad error callback

                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        // Interstitial ad is loaded and ready to be displayed


                        startActivity(new Intent(trickstowin.this, MainActivity.class));
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
                progressDialog = new ProgressDialog(trickstowin.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                interstitialAd.loadAd(
                        interstitialAd.buildLoadAdConfig()
                                .withAdListener(interstitialAdListener)
                                .build());


            }
        });

    }

    @Override
    public void onBackPressed() {

                Intent intent = new Intent(trickstowin.this, rules.class);
                startActivity(intent);

            }

}