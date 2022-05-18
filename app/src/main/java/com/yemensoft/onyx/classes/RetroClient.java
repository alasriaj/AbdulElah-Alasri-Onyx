package com.yemensoft.onyx.classes;

import androidx.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yemensoft.onyx.interfaces.JsonPlaceHolderApi;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;


public class RetroClient {
    private static long to = 60;
    private static Retrofit retrofit;
    private static Gson gson = new GsonBuilder()
            .setLenient()
            .create();
    private static HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    private static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .readTimeout(to, TimeUnit.SECONDS)
            .connectTimeout(to, TimeUnit.SECONDS)
            .callTimeout(to, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addInterceptor(interceptor)
            .build();

    private static Retrofit getRetrofitInstance() {
        try {
            retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(Services.URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retrofit;
    }

    @NonNull
    public static JsonPlaceHolderApi getApiService() {
        return getRetrofitInstance().create(JsonPlaceHolderApi.class);
    }

}
