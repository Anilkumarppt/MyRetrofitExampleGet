package com.example.dell.myretrofitexampleget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    QuestionApiService apiService;
    ListView listView;
    private static final String TAG="QuestionList";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);

        apiService = RestClient.getClient().create(QuestionApiService.class);
        fetchQuestionList();

    }

    private void fetchQuestionList() {
        retrofit2.Call<QuestionList> call = apiService.fetchQuestions("android");
            call.enqueue(new Callback<QuestionList>() {
                @Override
                public void onResponse(retrofit2.Call<QuestionList> call, Response<QuestionList> response) {
                    Log.d(TAG,"Total number of fetches from url:"+response.body().getQuestionList());
                    Toast.makeText(MainActivity.this, (CharSequence) response.body(), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(retrofit2.Call<QuestionList> call, Throwable t) {
                            System.out.print(t.getMessage());
                }
            });
    }
}


