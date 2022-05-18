package com.yemensoft.onyx.classes;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;


public class ISCONNECTED {

    private Context context;

    public ISCONNECTED(Context context) {

        this.context = context;
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean isConnected() {
        final ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    public void Show(@NonNull final Context ctx, String msg) {

        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
        builder.setTitle("Message");
        builder.setMessage(msg);
        builder.setNegativeButton("Setting", (dialogInterface, i) -> ctx.startActivity(new Intent(WifiManager.ACTION_PICK_WIFI_NETWORK)));
        builder.setPositiveButton("Cancel", (dialogInterface, i) -> dialogInterface.dismiss());
        builder.show();

    }


}
