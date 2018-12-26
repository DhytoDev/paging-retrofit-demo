package com.dhytodev.pagingwithretrofitdemo.ui.view_model;

import com.dhytodev.pagingwithretrofitdemo.data.model.Photo;
import com.dhytodev.pagingwithretrofitdemo.data.source.PhotoDataSourceFactory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

public class PhotoViewModel extends ViewModel {
    public LiveData<PagedList<Photo>> photoPagedList ;

    public PhotoViewModel() {
        PhotoDataSourceFactory photoDataSourceFactory =
                new PhotoDataSourceFactory();

        PagedList.Config pagedListConfig =
                new PagedList.Config.Builder()
                        .setEnablePlaceholders(false)
                        .setPageSize(3)
                        .build();

        photoPagedList = new LivePagedListBuilder<>
                (photoDataSourceFactory, pagedListConfig)
                .build();
    }
}
