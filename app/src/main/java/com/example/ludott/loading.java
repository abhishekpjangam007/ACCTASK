package com.example.ludott;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class loading {
    private Activity activity;
    private AlertDialog dialog;

    loading(Activity myactivity){
        activity=myactivity;
    }
    void startloadingDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_dialog, null));
        builder.setCancelable(true);

        dialog = builder.create();
        dialog.show();
    }
    void dismissDialog(){
        dialog.dismiss();
    }
}

