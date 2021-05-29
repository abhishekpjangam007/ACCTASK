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
import com.unity3d.ads.UnityAds;

public class privacypolicy extends AppCompatActivity {
    TextView textview;
    ImageView bckpp,hmp;
    private AdView adView;
    private InterstitialAd interstitialAd;
    private String interstatial_id="interstitial";

    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacypolicy);
        progressDialog = new ProgressDialog(this);
        //FB INTERSTTIAL
        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "CAROUSEL_IMG_SQUARE_APP_INSTALL#1116934268700829_1118606095200313");



        //AUDIENCE NETWORK
//        AudienceNetworkAds.initialize(this);

        adView=new AdView(this,"IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();

bckpp=findViewById(R.id.bckpp);//Button
        final MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.click);
        bckpp.setOnClickListener(new View.OnClickListener() {
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
////                        progressDialog.dismiss();
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
                startActivity(new Intent(privacypolicy.this, MainActivity.class));

//                interstitialAd.loadAd(
//                        interstitialAd.buildLoadAdConfig()
//                                .withAdListener(interstitialAdListener)
//                                .build());
//                progressDialog = new ProgressDialog(privacypolicy.this);
//                progressDialog.show();
//                progressDialog.setContentView(R.layout.progress_dialog);
//                progressDialog.getWindow().setBackgroundDrawableResource(
//                        android.R.color.transparent
//                );
            }
        });
        textview=findViewById(R.id.pptxt);//TextView

        String para="\n"+
                "●Privacy Policy\n" +
                "Maxgen built the Ludo Tips And Tricks app as a Free app. This SERVICE is provided by\n" +
                "Maxgen at no cost and is intended for use as is.\n" +
                "This page is used to inform visitors regarding our policies with the collection, use, and\n" +
                "disclosure of Personal Information if anyone decided to use our Service.\n" +
                "If you choose to use our Service, then you agree to the collection and use of information in\n" +
                "relation to this policy. The Personal Information that we collect is used for providing and\n" +
                "improving the Service. We will not use or share your information with anyone except as\n" +
                "described in this Privacy Policy.\n" +
                "The terms used in this Privacy Policy have the same meanings as in our Terms and\n" +
                "Conditions, which is accessible at Ludo Tips And Tricks unless otherwise defined in this\n" +
                "●Privacy Policy.\n" +
                "Information Collection and Use\n" +
                "For a better experience, while using our Service, we may require you to provide us with\n" +
                "certain personally identifiable information, including but not limited to Tips and tricks to win\n" +
                "ludo. The information that we request will be retained by us and used as described in this\n" +
                "●privacy policy.\n" +
                "The app does use third party services that may collect information used to identify you.\n" +
                "Link to privacy policy of third party service providers used by the app\n" +
                "* [Google Play Services](https://www.google.com/policies/privacy/)\n" +
                "* [AdMob](https://support.google.com/admob/answer/6128543?hl=en)\n" +
                "●Log Data\n" +
                "We want to inform you that whenever you use our Service, in a case of an error in the app\n" +
                "we collect data and information (through third party products) on your phone called Log\n" +
                "Data. This Log Data may include information such as your device Internet Protocol (“IP”)\n" +
                "address, device name, operating system version, the configuration of the app when utilizing\n" +
                "our Service, the time and date of your use of the Service, and other statistics.\n" +
                "●Cookies\n" +
                "Cookies are files with a small amount of data that are commonly used as anonymous unique\n" +
                "identifiers. These are sent to your browser from the websites that you visit and are stored on\n" +
                "your device's internal memory.\n" +
                "This Service does not use these “cookies” explicitly. However, the app may use third party\n" +
                "code and libraries that use “cookies” to collect information and improve their services. You\n" +
                "have the option to either accept or refuse these cookies and know when a cookie is beingsent to your device. If you choose to refuse our cookies, you may not be able to use some\n" +
                "portions of this Service.\n" +
                "●Service Providers\n" +
                "We may employ third-party companies and individuals due to the following reasons:\n" +
                "* To facilitate our Service;\n" +
                "* To provide the Service on our behalf;\n" +
                "* To perform Service-related services; or\n" +
                "* To assist us in analyzing how our Service is used.\n" +
                "We want to inform users of this Service that these third parties have access to your Personal\n" +
                "Information. The reason is to perform the tasks assigned to them on our behalf. However,\n" +
                "they are obligated not to disclose or use the information for any other purpose.\n" +
                "●Security\n" +
                "We value your trust in providing us your Personal Information, thus we are striving to use\n" +
                "commercially acceptable means of protecting it. But remember that no method of\n" +
                "transmission over the internet, or method of electronic storage is 100% secure and reliable,\n" +
                "and we cannot guarantee its absolute security.\n" +
                "●Links to Other Sites\n" +
                "This Service may contain links to other sites. If you click on a third-party link, you will be\n" +
                "directed to that site. Note that these external sites are not operated by us. Therefore, we\n" +
                "strongly advise you to review the Privacy Policy of these websites. We have no control over\n" +
                "and assume no responsibility for the content, privacy policies, or practices of any third-party\n" +
                "sites or services.\n" +
                "●Children’s Privacy\n" +
                "These Services do not address anyone under the age of 13. We do not knowingly collect\n" +
                "personally identifiable information from children under 13 years of age. In the case we\n" +
                "discover that a child under 13 has provided us with personal information, we immediately\n" +
                "delete this from our servers. If you are a parent or guardian and you are aware that your\n" +
                "child has provided us with personal information, please contact us so that we will be able to\n" +
                "do necessary actions.\n" +
                "●Changes to This Privacy Policy\n" +
                "We may update our Privacy Policy from time to time. Thus, you are advised to review this\n" +
                "page periodically for any changes. We will notify you of any changes by posting the new\n" +
                "Privacy Policy on this page.\n" +
                "This policy is effective as of 2021-03-18**Contact Us**\n" +
                "●If you have any questions or suggestions about our Privacy Policy, do not hesitate to contact\n" +
                "us at meera@maxgentechnologies.com";

        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());

        hmp=findViewById(R.id.phome);
        final MediaPlayer mediaplayer3=MediaPlayer.create(this,R.raw.click);
        hmp.setOnClickListener(new View.OnClickListener() {
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
//                        progressDialog.dismiss();
//                        startActivity(new Intent(privacypolicy.this, MainActivity.class));
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
//
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
//                interstitialAd.loadAd(
//                        interstitialAd.buildLoadAdConfig()
//                                .withAdListener(interstitialAdListener)
//                                .build());
//                progressDialog = new ProgressDialog(privacypolicy.this);
//                progressDialog.show();
//                progressDialog.setContentView(R.layout.progress_dialog);
//                progressDialog.getWindow().setBackgroundDrawableResource(
//                        android.R.color.transparent
//                );
                startActivity(new Intent(privacypolicy.this, MainActivity.class));

                }

        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(privacypolicy.this,MainActivity.class);
        startActivity(intent);
    }

}