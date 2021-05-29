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

public class lrules extends AppCompatActivity {
private ImageView bcklr,hml;
TextView rtxt;
    private String unityGameID = "4072975";
    private Boolean testMode=true;
    private String interstatial_id="interstitial";
    private AdView adView;
    ProgressDialog progressDialog;
    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lrules);
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
//                startActivity(new Intent(lrules.this, rules.class));

            }
//            {
//                startActivity(new Intent(lrules.this, MainActivity.class));
//            }

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
//        progressDialog = new ProgressDialog(lrules.this);
//        progressDialog.show();
//
//        progressDialog.setContentView(R.layout.progress_dialog);
//        progressDialog.getWindow().setBackgroundDrawableResource(
//                android.R.color.transparent
//        );
//        interstitialAd.loadAd(
//                interstitialAd.buildLoadAdConfig()
//                        .withAdListener(interstitialAdListener)
//                        .build());
        ////////
        UnityAds.initialize(lrules.this,unityGameID,testMode);
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



        bcklr=findViewById(R.id.bcklr);
        final MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.click);
        bcklr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(lrules.this, rules.class));
//                progressDialog = new ProgressDialog(lrules.this);
//                progressDialog.show();
//                progressDialog.setContentView(R.layout.progress_dialog);
//                progressDialog.getWindow().setBackgroundDrawableResource(
//                        android.R.color.transparent
//                );
//                interstitialAd.loadAd(
//                        interstitialAd.buildLoadAdConfig()
//                                .withAdListener(interstitialAdListener)
//                                .build());

            }
        });
rtxt=findViewById(R.id.rltxt);
String para="●Each player rolls the die; the player who get 6 on the die begins the game. Players alternate turns in a clockwise direction.\n" +
        "●To enter a piece into play from its yard to its starting square, a player must roll a 6. The player can draw a piece from home every time he gets a 6 unless home is empty or move a piece 6 times. If the player has no pieces yet in play and rolls other than a 6, the turn passes to the next player.\n" +
        "●Players must always move a piece according to the die value rolled. Once a player has one or more pieces in play, he selects a piece and moves it forwards along the track the number of squares indicated by the die. If an opponent's piece is blocking your pathway, you will need to land on the same space as the piece to capture it. You cannot move past that piece. Passesare not allowed; if no move is possible, the turn moves to the next player.\n" +
        "●If the player cannot draw a piece from home, rolling a 6 earns the player an additional or bonus roll in that turn. If the bonus roll results in a 6 again, the player earns again an additional bonus roll. If the third roll is also a 6, the player may not move and the turn immediately passes to the next player.\n" +
        "●If the advance of a piece ends on a square occupied by an opponent's piece, the opponent piece is returned to its owner's yard. The returned piece can be re-entered into play only when the owner rolls a 6. If a piece lands on the same space as another piece of the same colour, the pieces are doubled and form a block.If the advance of a block ends on an opponent’s block, the latter is captured and returned to its owner’s yard, collectively. \n" +
        "●A player's home column squares are always safe since no opponent may enter them. In the home column, you cannot jump over your piece. Roll the exact number needed to get each to piece onto the home triangle.\n";
rtxt.setText(para);
rtxt.setMovementMethod(new ScrollingMovementMethod());
/////////////////////////////////

        hml=findViewById(R.id.lhome);
        final MediaPlayer mediaplayer3=MediaPlayer.create(this,R.raw.click);
        hml.setOnClickListener(new View.OnClickListener() {
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
//
//
//                        progressDialog.dismiss();
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
//                progressDialog = new ProgressDialog(lrules.this);
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

                startActivity(new Intent(lrules.this, MainActivity.class));

            }
        });

    }
/////////////////////////////////////////////////////////////////////////////////
    private void DisplayInterstitialAd () {
        if (UnityAds.isReady(interstatial_id)){
            UnityAds.show(lrules.this,interstatial_id);
        }
    }

    @Override
    public void onBackPressed() {

                Intent intent = new Intent(lrules.this, rules.class);
                startActivity(intent);

            }

}