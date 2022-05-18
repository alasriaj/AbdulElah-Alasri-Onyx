package com.yemensoft.onyx.classes;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

import java.util.Locale;

public class LANG {

    public String s = REFERENCE_APP.preferences_slid.getString("LANG", "ar");
    public Context context;

    public LANG(Context context) {
        this.context = context;
        Locale locale = new Locale(s + "", "US");
        Locale.setDefault(locale);
        updateResourcesLocale(context, locale);

    }

    private static void updateResourcesLocale(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        context.getApplicationContext().createConfigurationContext(configuration);
        configuration.setLayoutDirection(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        resources.finishPreloading();
    }

}
