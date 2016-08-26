package com.tianyuan.animation.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.tianyuan.animation.R;

public class ViewAniActivity extends AppCompatActivity {


    private ImageView Imgview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ani);
        Imgview= (ImageView) findViewById(R.id.imageview);
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.hyperspace_jump);
        Imgview.startAnimation(animation);
    }
}
