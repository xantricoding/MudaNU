package com.example.mudanu.model;

public class About {
    public String getPhotoAuthor() {
        return PhotoAuthor;
    }

    public void setPhotoAuthor(String photoAuthor) {
        PhotoAuthor = photoAuthor;
    }

    public String getNameAuthor() {
        return NameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        NameAuthor = nameAuthor;
    }

    public String getEmailAuthor() {
        return EmailAuthor;
    }

    public void setEmailAuthor(String emailAuthor) {
        EmailAuthor = emailAuthor;
    }

    private String PhotoAuthor;
    private String NameAuthor;
    private String EmailAuthor;
}
