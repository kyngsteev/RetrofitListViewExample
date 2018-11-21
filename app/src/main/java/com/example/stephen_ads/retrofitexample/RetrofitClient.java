package com.example.stephen_ads.retrofitexample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    //private static final String BASE_URL = "https://simplifiedcoding.net/demos/";
    private static final String BASE_URL = "https://revpay.ebs-rcm.com/RevpayTest/Interface/";
    private static RetrofitClient sInstance;
    private Retrofit retrofit;

    private RetrofitClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClient getsInstance(){
        if(sInstance == null){
            sInstance = new RetrofitClient();
        }
        return sInstance;
    }

    public Api getApi(){
        return retrofit.create(Api.class);
    }
}
