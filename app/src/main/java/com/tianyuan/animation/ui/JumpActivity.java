package com.tianyuan.animation.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.tianyuan.animation.R;

public class JumpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);
        ImageView image = (ImageView) findViewById(R.id.imageview);
        Animation hyperspaceJump = AnimationUtils.loadAnimation(this, R.anim.hyperspace_jump);
        image.startAnimation(hyperspaceJump);
    }

    public static void lauch(Context mcontext){
        Intent intent=new Intent(mcontext,JumpActivity.class);
        mcontext.startActivity(intent);
    }
}
