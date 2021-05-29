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

public class waitinggame extends AppCompatActivity {
private ImageView bckwg,hmw;
TextView wg;
    private String unityGameID = "4072975";
    private Boolean testMode=false;
    private String interstatial_id="interstitial";
    private AdView adView;
    private InterstitialAd interstitialAd;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waitinggame);
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
        ////
        UnityAds.initialize(waitinggame.this,unityGameID,testMode);
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

        adView=new AdView(this,"IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();
        //
    bckwg=findViewById(R.id.bckwg);
        final MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.click);
    bckwg.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(waitinggame.this, tricksntips.class));

        }
    });

        hmw=findViewById(R.id.wghome);
        final MediaPlayer mediaplayer3=MediaPlayer.create(this,R.raw.click);
        hmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
//                    @Override
//                    public void onInterstitialDisplayed(Ad ad) {
//                        // Interstitial ad displayed callback
//
//                    }
//
//                    @Override
//                    public void onInterstitialDismissed(Ad ad) {
//                        // Interstitial dismissed callback
//                        startActivity(new Intent(waitinggame.this, MainActivity.class));
//                        progressDialog.dismiss();
//
//                    }
//
//                    @Override
//                    public void onError(Ad ad, AdError adError) {
//                        // Ad error callback
//
//                    }
//
//                    @Override
//                    public void onAdLoaded(Ad ad) {
//                        // Interstitial ad is loaded and ready to be displayed
//
//                        // Show the ad
//                        interstitialAd.show();
//                    }
//
//                    @Override
//                    public void onAdClicked(Ad ad) {
//                        // Ad clicked callback
//
//                    }
//
//                    @Override
//                    public void onLoggingImpression(Ad ad) {
//                        // Ad impression logged callback
//
//                    }
//                };
//                progressDialog = new ProgressDialog(waitinggame.this);
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
                startActivity(new Intent(waitinggame.this, MainActivity.class));


            }
        });

        wg=findViewById(R.id.wgtxt);
        String para="●Playing the waiting game in Ludo King can have amazing benefits. For example, if your pieces are placed onstar-shaped\n " +
                "safe zone on the board and a bad dice roll has a chance of exposing you to your opponents, do not take the chance.\n " +
                "●Instead,wait it out till you have a good dice roll and keep distance or try to land yourself on the opponent’s piece."+
                "\n"+
                "\n";
        wg.setText(para);
        wg.setMovementMethod(new ScrollingMovementMethod());

    }
    private void DisplayInterstitialAd () {
        if (UnityAds.isReady(interstatial_id)){
            UnityAds.show(waitinggame.this,interstatial_id);
        }
    }
    @Override
    public void onBackPressed() {


                Intent intent = new Intent(waitinggame.this, tricksntips.class);
                startActivity(intent);

            }

        }