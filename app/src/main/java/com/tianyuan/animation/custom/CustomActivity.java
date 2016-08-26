package com.tianyuan.animation.custom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tianyuan.animation.R;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
    }

    public  static  void lauch(Context mcontext){
        Intent intent =new Intent(mcontext,CustomActivity.class);
        mcontext.startActivity(intent);
    }
}
