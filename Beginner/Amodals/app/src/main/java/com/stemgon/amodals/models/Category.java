package com.stemgon.amodals.models;

public class Category {

    private int image;
    private String name;
    private String content;
    private int id;


    public Category(int image, String name, String content, int id) {
        this.image = image;
        this.name = name;
        this.content = content;
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
