package com.example.qiaoxian.mymutaotravel.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qiaoxian.mymutaotravel.R;
import com.example.qiaoxian.mymutaotravel.adapter.EightAdpter;
import com.example.qiaoxian.mymutaotravel.adapter.FindAdapter1;
import com.example.qiaoxian.mymutaotravel.entity.MyImages;

public class FindFragment extends Fragment{

    private RecyclerView recyclerView1,recyclerView2;
    private int[] icons1 ={R.drawable.find_main_travel,R.drawable.find_main_travel,
            R.drawable.find_main_hotwind,R.drawable.find_main_way};
    private int[] icons2 = {R.drawable.find_channel_parter,
            R.drawable.find_chnnel_me,R.drawable.find_channel_online};
    private String[] menu1, menu2,information;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_find,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //recyclerview1
        recyclerView1 = (RecyclerView)getView().findViewById(R.id.findrecycle1);
        menu1 = this.getActivity().getResources().getStringArray(R.array.findMenuOne);
        recyclerView1.setLayoutManager(new GridLayoutManager(getActivity(),4));
        EightAdpter eightAdpter1 = new EightAdpter(getActivity(), MyImages.getMenu(icons1,menu1));
        recyclerView1.setAdapter(eightAdpter1);

        //recyclerview2
        recyclerView2 = (RecyclerView)getView().findViewById(R.id.findrecycle2);
        menu2 = this.getActivity().getResources().getStringArray(R.array.findMenuTwo);
        information = this.getActivity().getResources().getStringArray(R.array.findMenuTwoTwo);
        recyclerView2.setLayoutManager(new GridLayoutManager(getActivity(),3));
        FindAdapter1 findAdapter1 = new FindAdapter1(getActivity(),MyImages.getMenuFind(icons2,menu2,information));
        recyclerView2.setAdapter(findAdapter1);

    }


}
