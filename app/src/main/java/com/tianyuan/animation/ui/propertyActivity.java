package com.tianyuan.animation.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.tianyuan.animation.R;

public class propertyActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
        findViewById(R.id.id_ball).setOnClickListener(this);
    }



    public void rotateAnimRun(View view){
        Log.d("TAG", "rotateAnimRun: ");
        ObjectAnimator.ofFloat(view,"roytationX",0.0f,360.0f)
                .setDuration(1000)
                .start();
    }


    public static void lauch(Context mcontext){
        Intent intent=new Intent(mcontext,propertyActivity.class);
        mcontext.startActivity(intent);
    }

    @Override
    public void onClick(View view) {

    }
}
