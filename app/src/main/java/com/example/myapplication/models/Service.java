package com.example.myapplication.models;

import android.net.Uri;

public class Service {

    int id, sub_category_id;
    String title, img, url;


    public Service(int id, String title, String img, int sub_category_id, String url) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.sub_category_id = sub_category_id;
        this.url = url;
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

    public Uri getImg() {
        return Uri.parse(img);
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getSub_category_id() {
        return sub_category_id;
    }

    public void setSub_category_id(int sub_category_id) {
        this.sub_category_id = sub_category_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
