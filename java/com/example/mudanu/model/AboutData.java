package com.example.mudanu.model;

import java.util.ArrayList;

public class AboutData {
    public static String [][] dataAbout = new String[][]{
            {"Ahmad Briezy Baihaqi", "Brezy.Baihaqy@gmail.com", "https://pbs.twimg.com/profile_images/931724061226311680/NSFKZ0AH_400x400.jpg"},
            {"Ahmad Briezy Baihaqi", "Brezy.Baihaqy@gmail.com", "https://pbs.twimg.com/profile_images/931724061226311680/NSFKZ0AH_400x400.jpg"},
            {"Ahmad Briezy Baihaqi", "Brezy.Baihaqy@gmail.com", "https://pbs.twimg.com/profile_images/931724061226311680/NSFKZ0AH_400x400.jpg"},
    };
    public static ArrayList<About> getListData(){
        ArrayList<About> list = new ArrayList<>();
        for (String[] aData : dataAbout){
            About about = new About();
            about.setNameAuthor(aData[0]);
            about.setEmailAuthor(aData[1]);
            about.setPhotoAuthor(aData[2]);

            list.add(about);
        }

        return list;
}}
