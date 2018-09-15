package com.example.qiaoxian.mymutaotravel.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qiaoxian.mymutaotravel.R;
import com.example.qiaoxian.mymutaotravel.adapter.EightAdpter;
import com.example.qiaoxian.mymutaotravel.adapter.HeaderAdapter;
import com.example.qiaoxian.mymutaotravel.entity.MyImages;



public class MainFragment extends Fragment {
    private ViewPager viewPager1;
    private RecyclerView recyclerView1,recyclerView2;
    private String[] menuWords, menuwords2;

    private int[] icons = {R.drawable.header_pic_ad1,R.drawable.header_pic_ad2,R.drawable.header_pic_ad1};
    private int[] menuIcons = {R.drawable.menu_airport,R.drawable.menu_hatol,R.drawable.menu_trav,R.drawable.menu_nearby,
    R.drawable.menu_ticket,R.drawable.menu_train,R.drawable.menu_course,R.drawable.menu_trav};
    private int[] menuicons2 = {R.drawable.menu_second_ticket,R.drawable.menu_second_service,R.drawable.menu_nearby};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //viewpager
        viewPager1 = (ViewPager)getView().findViewById(R.id.viewpager_head);
        HeaderAdapter headerAdapter = new HeaderAdapter(getActivity(), MyImages.getImageViewList(getActivity(),icons));
        viewPager1.setAdapter(headerAdapter);

        //recycleview
        recyclerView1 = (RecyclerView)getView().findViewById(R.id.recycleview);
        menuWords = this.getActivity().getResources().getStringArray(R.array.myMenuWord);
        recyclerView1.setLayoutManager(new GridLayoutManager(getActivity(),4));
        EightAdpter eightAdpter = new EightAdpter(getActivity(),MyImages.getMenu(menuIcons,menuWords));
        recyclerView1.setAdapter(eightAdpter);

        recyclerView2 = (RecyclerView)getView().findViewById(R.id.recycleview2);
        menuwords2 = this.getActivity().getResources().getStringArray(R.array.mySecondMenu);
        recyclerView2.setLayoutManager(new GridLayoutManager(getActivity(),3));
        EightAdpter eightAdpter2 = new EightAdpter(getActivity(),MyImages.getMenu(menuicons2,menuwords2));
        recyclerView2.setAdapter(eightAdpter2);


    }
}
