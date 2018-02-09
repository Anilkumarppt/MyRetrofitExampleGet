package com.example.dell.myretrofitexampleget;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Dell on 09-02-2018.
 */

public interface QuestionApiService {

    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<QuestionList> fetchQuestions(@Query("tagged") String tags);

}
