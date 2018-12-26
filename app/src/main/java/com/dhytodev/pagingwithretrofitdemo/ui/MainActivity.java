package com.dhytodev.pagingwithretrofitdemo.ui;

import android.os.Bundle;

import com.dhytodev.pagingwithretrofitdemo.R;
import com.dhytodev.pagingwithretrofitdemo.data.model.Photo;
import com.dhytodev.pagingwithretrofitdemo.ui.adapter.PhotoAdapter;
import com.dhytodev.pagingwithretrofitdemo.ui.view_model.PhotoViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        PhotoViewModel photoViewModel = ViewModelProviders.of(this)
                .get(PhotoViewModel.class);
        final PhotoAdapter adapter = new PhotoAdapter(this);

        photoViewModel.photoPagedList.observe(this,
                new Observer<PagedList<Photo>>() {
                    @Override
                    public void onChanged(PagedList<Photo> photos) {
                        adapter.submitList(photos);
                    }
                });

        recyclerView.setAdapter(adapter);
    }
}
