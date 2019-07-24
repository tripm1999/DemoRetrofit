package com.example.demoretrofit;

import com.example.demoretrofit.model.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface PolyService {
    //http://asian.dotplays.com/wp-json/wp/v2/categories?page=1& per_page=10

    @GET("wp-json/wp/v2/posts")
    Call<List<Example>> getPostOfCategory(@Query("category") String category,

                                          @Query("per_page") String per_page,

                                          @Query("paging") String paging);
}
