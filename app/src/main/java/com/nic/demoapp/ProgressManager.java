package com.nic.demoapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class ProgressManager {

    private Context context;

    private AlertDialog aDProgress;

    public ProgressManager(Context context) {
        this.context = context;
    }

    public void showProgressDialog(String progress) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        View view = LayoutInflater.from(context).inflate(R.layout.pop_up_custom_progress, null);
        builder.setCancelable(false);
        builder.setView(view);

        TextView tvProgress = view.findViewById(R.id.tvProgress);
        tvProgress.setText(progress);

        aDProgress = builder.create();
        aDProgress.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        aDProgress.setCanceledOnTouchOutside(false);
        aDProgress.setCancelable(false);
        aDProgress.show();

    }

    public void dismissDialog() {
        if (aDProgress != null) {
            aDProgress.dismiss();
        }
    }

}
