package com.example.kafews;

public class ContactModel {
    int imageView;
    String tvName,tvNumber;

    public ContactModel(int imageView, String tvName, String tvNumber) {
        this.imageView = imageView;
        this.tvName = tvName;
        this.tvNumber = tvNumber;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getTvNumber() {
        return tvNumber;
    }

    public void setTvNumber(String tvNumber) {
        this.tvNumber = tvNumber;
    }
}
