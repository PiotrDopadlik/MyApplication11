package com.example.myapplication;

public class Language {
    private String name;
    private int pictureId;

    public Language(String name, int pictureId) {
        this.name = name;
        this.pictureId = pictureId;
    }

    @Override
    public String toString() {
        return name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
