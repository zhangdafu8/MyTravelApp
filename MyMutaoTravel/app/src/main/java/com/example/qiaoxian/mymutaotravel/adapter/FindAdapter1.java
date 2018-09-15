package com.example.qiaoxian.mymutaotravel.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qiaoxian.mymutaotravel.R;
import com.example.qiaoxian.mymutaotravel.entity.Menu;

import java.util.List;

public class FindAdapter1 extends RecyclerView.Adapter<MyViewHolder1> {

    private Context context;
    private List<Menu> menus;

    public FindAdapter1(Context context, List<com.example.qiaoxian.mymutaotravel.entity.Menu> menus) {
        this.context = context;
        this.menus = menus;
    }

    @NonNull
    @Override
    public MyViewHolder1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder1(LayoutInflater.from(context).inflate(R.layout.four_menu,null));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder1 myViewHolder1, int i) {
        Menu menuFind = menus.get(i);
        myViewHolder1.imageViewforeight.setImageResource(menuFind.icon);
        myViewHolder1.textViewforeight1.setText(menuFind.menu);
        myViewHolder1.textViewforeight2.setText(menuFind.information);

    }

    @Override
    public int getItemCount() {
        return null!= menus?menus.size():0;
    }
}

class MyViewHolder1 extends RecyclerView.ViewHolder{
    public ImageView imageViewforeight;
    public TextView textViewforeight1;
    public TextView textViewforeight2;

    public MyViewHolder1(@NonNull View itemView) {
        super(itemView);
        imageViewforeight = (ImageView)itemView.findViewById(R.id.fourImage);
        textViewforeight1 = (TextView)itemView.findViewById(R.id.fourtext1);
        textViewforeight2 = (TextView)itemView.findViewById(R.id.fourtext2);
    }
}