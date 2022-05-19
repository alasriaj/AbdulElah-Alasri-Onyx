package com.yemensoft.onyx.classes;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;

public class REFERENCE_APP {

    public static SharedPreferences preferences_slid;
    public static SharedPreferences.Editor editor_slid;


    public REFERENCE_APP(@NonNull Context context) {
        preferences_slid = context.getSharedPreferences("Onyx", MODE_PRIVATE);
        editor_slid = preferences_slid.edit();
    }

    public static void Delete() {
        preferences_slid.edit().clear().apply();
    }

    public static void setValue(final String key, final String value) {
        editor_slid.putString(key, value);
        editor_slid.commit();
    }

    public static String getValue(final String key) {
        return preferences_slid.getString(key, null);
    }

}
