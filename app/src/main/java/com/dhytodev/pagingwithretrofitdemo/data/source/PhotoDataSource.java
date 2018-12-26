package com.dhytodev.pagingwithretrofitdemo.data.source;

import com.dhytodev.pagingwithretrofitdemo.data.model.Photo;
import com.dhytodev.pagingwithretrofitdemo.data.network.NetworkClient;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PhotoDataSource extends PageKeyedDataSource<Integer, Photo> {
    private static final int ALBUM_ID = 1;

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull final LoadInitialCallback<Integer, Photo> callback) {
        NetworkClient.getInstance().getApi().getPhotosByAlbumId(ALBUM_ID)
                .enqueue(new Callback<List<Photo>>() {
                    @Override
                    public void onResponse(Call<List<Photo>> call, Response<List<Photo>> response) {
                        if (response.body() != null) {
                            callback.onResult(response.body(),
                                    null, ALBUM_ID + 1);
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Photo>> call, Throwable t) {

                    }
                });
    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Photo> callback) {

    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Photo> callback) {

    }
}
