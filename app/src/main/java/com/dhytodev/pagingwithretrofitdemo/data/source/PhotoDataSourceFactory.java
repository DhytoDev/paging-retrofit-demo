package com.dhytodev.pagingwithretrofitdemo.data.source;

import com.dhytodev.pagingwithretrofitdemo.data.model.Photo;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

public class PhotoDataSourceFactory  extends DataSource.Factory<Integer, Photo> {

    private MutableLiveData<PageKeyedDataSource<Integer, Photo>>
            photoLiveDataSource = new MutableLiveData<>();

    @NonNull
    @Override
    public DataSource<Integer, Photo> create() {
        PhotoDataSource photoDataSource = new PhotoDataSource();
        photoLiveDataSource.postValue(photoDataSource);

        return photoDataSource;
    }
}
