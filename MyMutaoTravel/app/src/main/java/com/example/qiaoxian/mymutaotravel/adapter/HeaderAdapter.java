package com.example.qiaoxian.mymutaotravel.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class HeaderAdapter extends PagerAdapter {
    private Context context;
    private List<ImageView> images;

    public HeaderAdapter(Context context, List<ImageView> images){
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        if(images!=null){
            return images.size();
        }else{
            return 0;
        }
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(images.get(position));
        return images.get(position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(images.get(position));
    }
}
