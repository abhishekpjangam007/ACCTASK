package com.example.ludott;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
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
import com.unity3d.services.banners.UnityBanners;

public class history extends AppCompatActivity {
    private ImageView bck,lh,nxt;
    private String unityGameID = "4072975";
    private AdView adView;
    private Boolean testMode=true;
    private String interstatial_id="interstitial";
    private InterstitialAd interstitialAd;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
//               Intent intent=new Intent(history.this,MainActivity.class);
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
        progressDialog = new ProgressDialog(history.this);
        progressDialog.show();

        progressDialog.setContentView(R.layout.progress_dialog);
        progressDialog.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent
        );
        interstitialAd.loadAd(
                interstitialAd.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener)
                        .build());
        /////////////////////////////////////////////////////////////////

        setContentView(R.layout.activity_history);
        UnityAds.initialize(history.this,unityGameID,testMode);
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

////FB INTERSTTIAL
//        AudienceNetworkAds.initialize(this);
//        interstitialAd= new InterstitialAd(this,"295974358575140_295974568575119");
//        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
//            @Override
//            public void onInterstitialDisplayed(Ad ad) {
//
//            }
//
//            @Override
//            public void onInterstitialDismissed(Ad ad) {
//
//            }
//
//            @Override
//            public void onError(Ad ad, AdError adError) {
//
//            }
//
//            @Override
//            public void onAdLoaded(Ad ad) {
//
//            }
//
//            @Override
//            public void onAdClicked(Ad ad) {
//
//            }
//
//            @Override
//            public void onLoggingImpression(Ad ad) {
//
//            }
//        };
//        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(interstitialAdListener).build());

        //AUDIENCE NETWORK
//        AudienceNetworkAds.initialize(this);

        adView=new AdView(this,"IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();

        bck=findViewById(R.id.back);
        final loading loading = new loading(history.this);
        final MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.click);

        bck.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                
//                    Intent intent = new Intent(history.this, MainActivity.class);
//                    startActivity(intent);

                Intent intent=new Intent(history.this,MainActivity.class);
//                progressDialog = new ProgressDialog(history.this);
//                progressDialog.show();
//
//                progressDialog.setContentView(R.layout.progress_dialog);
//                progressDialog.getWindow().setBackgroundDrawableResource(
//                        android.R.color.transparent
//                );
//                interstitialAd.loadAd(
//                        interstitialAd.buildLoadAdConfig()
//                                .withAdListener(interstitialAdListener)
//                                .build());
                startActivity(intent);
//                progressDialog = new ProgressDialog(history.this);
//                progressDialog.show();
//
//                progressDialog.setContentView(R.layout.progress_dialog);
//                progressDialog.getWindow().setBackgroundDrawableResource(
//                        android.R.color.transparent
//                );

                }

        });

//        bck=findViewById(R.id.back);
//        bck.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(history.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });



        ImageView nxt= (ImageView) findViewById(R.id.nxt);

//        nxt.setColorFilter(0xdddd, PorterDuff.Mode.MULTIPLY);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.click);
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                UnityAds.show(history.this,interstatial_id);
//                UnityAds.load(interstatial_id);
                Intent intent = new Intent(history.this,rules.class);
                startActivity(intent);
                mediaplayer.start();
            }
        });





        lh=findViewById(R.id.history);
        final MediaPlayer Mediaplayer = MediaPlayer.create(this,R.raw.click);
        lh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                UnityAds.show(history.this,interstatial_id);
//                UnityAds.load(interstatial_id);
                Intent intent=new Intent(history.this,lhistory.class);
                startActivity(intent);
                mediaplayer.start();
            }
        });
    }
    private void DisplayInterstitialAd () {
        if (UnityAds.isReady(interstatial_id)){
            UnityAds.show(history.this,interstatial_id);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(history.this,MainActivity.class);
        startActivity(intent);
    }

}