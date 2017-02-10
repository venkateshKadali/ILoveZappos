package com.example.venky.zappos.service;

import com.example.venky.zappos.model.Example;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by venky on 2/7/2017.
 */

public interface APIService {
    @GET("Search?term=nike&key=b743e26728e16b81da139182bb2094357c31d331")
    /*Call<List<Student>> getStudentDetails();*/
    Call<Example> listRepos();

}
