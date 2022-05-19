package com.yemensoft.onyx.classes;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;

import androidx.appcompat.app.AlertDialog;

import retrofit2.Response;


public class Tools {

    private static ProgressDialog dialog;

    public static void isCheckResponse(Response<?> t, Context context, String action, String msg, int i) {

    }

    public static void sh_load(final Activity act) {

        dialog = new ProgressDialog(act);
        dialog.setMessage("Please waite...");
        dialog.setCancelable(false);
        dialog.show();
    }

    public static void sh_load() {
        dialog.dismiss();
    }


    public static void dialog(final Activity act, final String tit, final String msg) {

        AlertDialog.Builder builder = new AlertDialog.Builder(act);
        builder.setTitle(tit);
        builder.setMessage(msg);
        builder.setPositiveButton("موافق", (dialogInterface, i) -> dialogInterface.dismiss());
        builder.show();
    }

}
