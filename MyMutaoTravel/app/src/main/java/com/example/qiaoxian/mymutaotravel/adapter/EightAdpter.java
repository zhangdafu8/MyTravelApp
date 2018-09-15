package com.example.qiaoxian.mymutaotravel.adapter;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.qiaoxian.mymutaotravel.R;

import java.util.List;

public class EightAdpter extends RecyclerView.Adapter<MyViewHolder> {

    private Context context;
    private List<com.example.qiaoxian.mymutaotravel.entity.Menu> menus;

    public EightAdpter(Context context, List<com.example.qiaoxian.mymutaotravel.entity.Menu> menus) {
        this.context = context;
        this.menus = menus;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.eight_menu,null));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        com.example.qiaoxian.mymutaotravel.entity.Menu menunu = menus.get(position);
        holder.imageViewforeight.setImageResource(menunu.icon);
        holder.textViewforeight.setText(menunu.menu);
    }

    @Override
    public int getItemCount() {
        return null!= menus?menus.size():0;
    }
}

class MyViewHolder extends RecyclerView.ViewHolder{
    public ImageView imageViewforeight;
    public TextView textViewforeight;

    public MyViewHolder(View itemView) {
        super(itemView);
        imageViewforeight = (ImageView)itemView.findViewById(R.id.eightImage);
        textViewforeight = (TextView)itemView.findViewById(R.id.eighttext);
    }


}