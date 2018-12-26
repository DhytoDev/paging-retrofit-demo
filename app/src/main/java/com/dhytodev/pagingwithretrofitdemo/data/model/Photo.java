package com.dhytodev.pagingwithretrofitdemo.data.model;

public class Photo {
    private int almbumId;
    private int id;
    private String title ;
    private String url;
    private String thumbnailUrl ;

    public Photo(int almbumId, int id, String title, String url, String thumbnailUrl) {
        this.almbumId = almbumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getAlmbumId() {
        return almbumId;
    }

    public void setAlmbumId(int almbumId) {
        this.almbumId = almbumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
