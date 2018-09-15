package com.example.qiaoxian.mymutaotravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.qiaoxian.mymutaotravel.fragment.FindFragment;
import com.example.qiaoxian.mymutaotravel.fragment.MainFragment;
import com.example.qiaoxian.mymutaotravel.fragment.MeFragment;

public class MainActivity extends AppCompatActivity {
    private MainFragment mainFragment;
    private FindFragment findFragment;
    private MeFragment meFragment;
    private LinearLayout linearLayout1,linearLayout2,linearLayout3;
    private MyOnClickListener myOnClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        this.getSupportFragmentManager().beginTransaction().add(R.id.content,mainFragment)
                .show(mainFragment).add(R.id.content,findFragment).hide(findFragment)
                .add(R.id.content,meFragment).hide(meFragment).commit();
        initData();

    }


    private void initView() {
        mainFragment = new MainFragment();
        findFragment = new FindFragment();
        meFragment = new MeFragment();
        linearLayout1=(LinearLayout)this.findViewById(R.id.mainmenubutton);
        linearLayout2=(LinearLayout)this.findViewById(R.id.findmenubutton);
        linearLayout3=(LinearLayout)this.findViewById(R.id.memenubutton);
        myOnClickListener= new MyOnClickListener();
    }

    private void initData() {
        linearLayout1.setOnClickListener(myOnClickListener);
        linearLayout2.setOnClickListener(myOnClickListener);
        linearLayout3.setOnClickListener(myOnClickListener);
    }

    class MyOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.mainmenubutton:
                    MainActivity.this.getSupportFragmentManager().beginTransaction()
                            .show(mainFragment).hide(findFragment)
                            .hide(meFragment).commit();
                    break;
                case R.id.findmenubutton:
                    MainActivity.this.getSupportFragmentManager().beginTransaction()
                            .hide(mainFragment).show(findFragment)
                            .hide(meFragment).commit();
                    break;
                case R.id.memenubutton:
                    MainActivity.this.getSupportFragmentManager().beginTransaction()
                            .hide(mainFragment).hide(findFragment)
                            .show(meFragment).commit();
                    break;
            }
        }
    }
}
