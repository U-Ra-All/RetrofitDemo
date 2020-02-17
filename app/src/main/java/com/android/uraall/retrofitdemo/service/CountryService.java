package com.android.uraall.retrofitdemo.service;

import com.android.uraall.retrofitdemo.model.CountryInfo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CountryService {

    @GET("country/get/all")
    Call<CountryInfo> getResults();

}
