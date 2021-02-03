package io.geektech.myapplicationfragment;

public class MainModel {

    private String title;
    private String subTitle;
    private int imageView;

    public MainModel(String title, String subTitle, int imageView) {
        this.title = title;
        this.subTitle = subTitle;
        this.imageView = imageView;
    }

    public int getImageView() {
        return imageView;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }
}
