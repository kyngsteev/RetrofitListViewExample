package com.example.stephen_ads.retrofitexample;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {

    @GET("marvel")
    Call<List<Hero>> getHeroes();

    @FormUrlEncoded
    @POST("AgencyCode")
    Call<List<Agency>> createAgency(
            @Field("State") String state,
            @Field("Hash") String hash,
            @Field("ClientId") String clientId
    );
}
