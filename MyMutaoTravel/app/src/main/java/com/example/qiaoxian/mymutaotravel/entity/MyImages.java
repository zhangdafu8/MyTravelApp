package com.example.qiaoxian.mymutaotravel.entity;

import android.content.Context;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MyImages {

    public static List<ImageView> getImageViewList(Context context, int[] icons){
        List<ImageView> data = new ArrayList<ImageView>();
        for(int i = 0; i < icons.length;i++){
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageResource(icons[i]);
            data.add(imageView);
        }
        return data;
    }


    public static List<Menu> getMenu (int[] icons, String[] names){
        List<Menu> menus = new ArrayList<>();
        for(int i = 0;i<icons.length;i++){
            Menu menu = new Menu(icons[i],names[i]);
            menus.add(menu);
        }
        return menus;
    }

    public static List<Menu> getMenuFind (int[] icons, String[] names, String[] information){
        List<Menu> menus = new ArrayList<>();
        for(int i = 0;i<icons.length;i++){
            Menu menu = new Menu(icons[i],names[i],information[i]);
            menus.add(menu);
        }
        return menus;
    }
}
