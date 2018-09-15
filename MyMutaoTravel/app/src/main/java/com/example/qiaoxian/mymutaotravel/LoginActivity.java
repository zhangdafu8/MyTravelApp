package com.example.qiaoxian.mymutaotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        register = (Button)findViewById(R.id.button5);
    }

    public void myClick(View view) {
        switch (view.getId()){
            case R.id.button5:
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
        }
    }
}
