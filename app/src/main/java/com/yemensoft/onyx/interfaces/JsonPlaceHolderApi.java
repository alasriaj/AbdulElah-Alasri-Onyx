package com.yemensoft.onyx.interfaces;



import com.yemensoft.onyx.models.LoginRes;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface JsonPlaceHolderApi {

    String route = "API.php";

//    @Headers("Content-Type: application/json; charset=utf-8")
    @POST("CheckLogIn")
    Call<LoginRes> login(@Body Map<String, Object> inputs);


}