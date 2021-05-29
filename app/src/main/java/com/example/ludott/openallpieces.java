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

public class openallpieces extends AppCompatActivity {
private ImageView bckoap,hmo;
TextView oapt;
    private String unityGameID = "4072975";
    private Boolean testMode=false;
    private String interstatial_id="interstitial";
    private AdView adView;
    private InterstitialAd interstitialAd;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openallpieces);
        progressDialog = new ProgressDialog(this);
        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "CAROUSEL_IMG_SQUARE_APP_INSTALL#1116934268700829_1118606095200313");

        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback

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
        UnityAds.initialize(openallpieces.this,unityGameID,testMode);
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
        UnityAds.setListener(unityAdsListener);
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


        adView=new AdView(this,"IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();
        ////
        bckoap=findViewById(R.id.bckoap);
        final MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.click);
        bckoap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(openallpieces.this, tricksntips.class));




            }
        });

        hmo=findViewById(R.id.ophome);
        final MediaPlayer mediaplayer3=MediaPlayer.create(this,R.raw.click);
        hmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
//                    @Override
//                    public void onInterstitialDisplayed(Ad ad) {
//                        // Interstitial ad displayed callback
//                        // Log.e(TAG, "Interstitial ad displayed.");
//                    }
//
//                    @Override
//                    public void onInterstitialDismissed(Ad ad) {
//                        // Interstitial dismissed callback
//                        //  Log.e(TAG, "Interstitial ad dismissed.");
//                        startActivity(new Intent(openallpieces.this, MainActivity.class));
//                        progressDialog.dismiss();
//                    }
//
//                    @Override
//                    public void onError(Ad ad, AdError adError) {
//                        // Ad error callback
//                        //   Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
//                    }
//
//                    @Override
//                    public void onAdLoaded(Ad ad) {
//                        // Interstitial ad is loaded and ready to be displayed
//                        //  Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
//                        // Show the ad
//                        interstitialAd.show();
//                    }
//
//                    @Override
//                    public void onAdClicked(Ad ad) {
//                        // Ad clicked callback
//                        //  Log.d(TAG, "Interstitial ad clicked!");
//                    }
//
//                    @Override
//                    public void onLoggingImpression(Ad ad) {
//                        // Ad impression logged callback
//                        // Log.d(TAG, "Interstitial ad impression logged!");
//                    }
//                };
//                progressDialog = new ProgressDialog(openallpieces.this);
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
                startActivity(new Intent(openallpieces.this, MainActivity.class));


            }
        });

        oapt=findViewById(R.id.oaptxt);
        String para = "●The most important tip to win Ludo King is to open all " +
                "your pieces ASAP.Get all your pieces out as soon as possible."+
                "\n"+
                "\n";
        oapt.setText(para);
        oapt.setMovementMethod(new ScrollingMovementMethod());

    }
    private void DisplayInterstitialAd () {
        if (UnityAds.isReady(interstatial_id)){
            UnityAds.show(openallpieces.this,interstatial_id);
        }
    }

    @Override
    public void onBackPressed() {

                Intent intent = new Intent(openallpieces.this, tricksntips.class);
                startActivity(intent);

            }

}