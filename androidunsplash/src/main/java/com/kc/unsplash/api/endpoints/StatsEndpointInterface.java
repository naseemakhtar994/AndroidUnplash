package com.kc.unsplash.api.endpoints;

import com.kc.unsplash.models.Stats;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StatsEndpointInterface {

    @GET("stats/total")
    Call<Stats> getStats();

}
