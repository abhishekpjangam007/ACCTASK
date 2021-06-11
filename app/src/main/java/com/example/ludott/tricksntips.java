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

public class tricksntips extends AppCompatActivity {
    private ImageView backkk,spbtn,oapbtn,mapbtn,tssr,kta,waitbtn,egbtn,hmtt;
    private String unityGameID = "4072975";
    private Boolean testMode=false;
    private String interstatial_id="interstitial";
    private AdView adView;
    private InterstitialAd interstitialAd;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricksntips);
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

                progressDialog.dismiss();
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback

            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed

                startActivity(new Intent(tricksntips.this, trickstowin.class));
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
        ///////
        UnityAds.initialize(tricksntips.this,unityGameID,testMode);
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

//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(tricksntips.this,unityGameID,interstitialAdsListener,testMode);
     backkk=findViewById(R.id.backkk);
        final MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.click);
     backkk.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

//
             progressDialog = new ProgressDialog(tricksntips.this);
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
//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener1 = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(tricksntips.this,unityGameID,interstitialAdsListener1,testMode);
     spbtn=findViewById(R.id.spbtn);
        final MediaPlayer mediaplayer1 = MediaPlayer.create(this,R.raw.click);
     spbtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
//             UnityAds.show(tricksntips.this,interstatial_id);
//             UnityAds.load(interstatial_id);
             Intent intent=new Intent(tricksntips.this,safeplaces.class);
             startActivity(intent);
             mediaplayer1.start();
         }
     });
//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener2 = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(tricksntips.this,unityGameID,interstitialAdsListener2,testMode);
     oapbtn=findViewById(R.id.oap);
        final MediaPlayer mediaplayer2 = MediaPlayer.create(this,R.raw.click);
     oapbtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
//             UnityAds.show(tricksntips.this,interstatial_id);
//             UnityAds.load(interstatial_id);
             Intent intent=new Intent(tricksntips.this,openallpieces.class);
             startActivity(intent);
             mediaplayer2.start();
         }
     });
//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener3 = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(tricksntips.this,unityGameID,interstitialAdsListener3,testMode);
     mapbtn=findViewById(R.id.map);
        final MediaPlayer mediaplayer3 = MediaPlayer.create(this,R.raw.click);
     mapbtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
//             UnityAds.show(tricksntips.this,interstatial_id);
//             UnityAds.load(interstatial_id);
             Intent intent=new Intent(tricksntips.this,moveallpieces.class);
             startActivity(intent);
             mediaplayer3.start();
         }
     });
//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener4 = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(tricksntips.this,unityGameID,interstitialAdsListener4,testMode);
     tssr=findViewById(R.id.tssrbtn);
        final MediaPlayer mediaplayer4 = MediaPlayer.create(this,R.raw.click);
     tssr.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
//             UnityAds.show(tricksntips.this,interstatial_id);
//             UnityAds.load(interstatial_id);
             Intent intent=new Intent(tricksntips.this,the7steprule.class);
             startActivity(intent);
             mediaplayer4.start();
         }
     });
//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener5 = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(tricksntips.this,unityGameID,interstitialAdsListener5,testMode);
     kta=findViewById(R.id.kta);
        final MediaPlayer mediaplayer5 = MediaPlayer.create(this,R.raw.click);
     kta.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
//             UnityAds.show(tricksntips.this,interstatial_id);
//             UnityAds.load(interstatial_id);
             Intent intent=new Intent(tricksntips.this,killtheapponent.class);
             startActivity(intent);
             mediaplayer5.start();
         }
     });
//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener6 = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(tricksntips.this,unityGameID,interstitialAdsListener6,testMode);
     waitbtn=findViewById(R.id.waitbtn);
        final MediaPlayer mediaplayer6 = MediaPlayer.create(this,R.raw.click);
     waitbtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
//             UnityAds.show(tricksntips.this,interstatial_id);
//             UnityAds.load(interstatial_id);
             Intent intent=new Intent(tricksntips.this,waitinggame.class);
             startActivity(intent);
             mediaplayer6.start();
         }
     });
//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener7 = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(tricksntips.this,unityGameID,interstitialAdsListener7,testMode);
     egbtn=findViewById(R.id.egbtn);
        final MediaPlayer mediaplayer7 = MediaPlayer.create(this,R.raw.click);
     egbtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
//             UnityAds.show(tricksntips.this,interstatial_id);
//             UnityAds.load(interstatial_id);
             Intent intent=new Intent(tricksntips.this,escapegame.class);
             startActivity(intent);
             mediaplayer7.start();
         }
     });
//        MainActivity.UnityInterstitialAdsListener interstitialAdsListener8 = new MainActivity.UnityInterstitialAdsListener();
//        UnityAds.initialize(tricksntips.this,unityGameID,interstitialAdsListener8,testMode);
        hmtt=findViewById(R.id.tthome);
        final MediaPlayer mediaplayer8=MediaPlayer.create(this,R.raw.click);
        hmtt.setOnClickListener(new View.OnClickListener() {
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

//                        startActivity(new Intent(tricksntips.this, MainActivity.class));

                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        // Ad error callback

                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        // Interstitial ad is loaded and ready to be displayed

                        startActivity(new Intent(tricksntips.this, MainActivity.class));
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

                progressDialog = new ProgressDialog(tricksntips.this);
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
    private void DisplayInterstitialAd () {
        if (UnityAds.isReady(interstatial_id)){
            UnityAds.show(tricksntips.this,interstatial_id);
        }
    }

    @Override
    public void onBackPressed() {

                Intent intent = new Intent(tricksntips.this, trickstowin.class);
                startActivity(intent);

            }

}