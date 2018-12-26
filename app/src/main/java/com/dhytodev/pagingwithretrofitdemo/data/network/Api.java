package com.dhytodev.pagingwithretrofitdemo.data.network;

import com.dhytodev.pagingwithretrofitdemo.data.model.Photo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("/photos")
    Call<Photo> getPhotosByAlbumId(@Query("albumId") int albumId);
}
