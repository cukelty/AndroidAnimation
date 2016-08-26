package com.tianyuan.animation.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.tianyuan.animation.R;

public class propertyActivity extends AppCompatActivity implements View.OnClickListener{

  ImageView Imgview;
    Button mButton_scale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
        Imgview = (ImageView) findViewById(R.id.id_ball);
        findViewById(R.id.id_ball).setOnClickListener(this);
        findViewById(R.id.scale).setOnClickListener(this);
    }



    public void rotateAnimRun(View view){
        Log.d("TAG", "rotateAnimRun: ");
        ObjectAnimator.ofFloat(view,"rotationX",0.0f,180.0f)
                .setDuration(1000)
                .start();
    }


    public static void lauch(Context mcontext){
        Intent intent=new Intent(mcontext,propertyActivity.class);
        mcontext.startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.id_ball:
                rotateAnimRun(view);

                break;

            case R.id.scale:
                ObjectAnimator.ofFloat(Imgview,"scaleX",1.0f,4.0f)
                        .setDuration(1000)
                        .start();
                break;
        }

    }
}
