package com.example.dell.myretrofitexampleget;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dell on 09-02-2018.
 */

public class RestClient {
    public static final String BASE_URL="https://api.stackexchange.com";
    private static Retrofit retrofit=null;
     public static Retrofit getClient()
        {
            if(retrofit==null){
                retrofit=new Retrofit.Builder()
                        .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

            }
            return retrofit;
        }
}
