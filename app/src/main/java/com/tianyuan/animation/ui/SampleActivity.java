package com.tianyuan.animation.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.tianyuan.animation.R;

public class SampleActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imgPic;
    private Button btnAlpha, btnScale, btnTranslate, btnRotate;
    private Animation mAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        initView();
        initData();
    }





    private void initView() {

        imgPic = (ImageView) findViewById(R.id.imageview);
        btnAlpha = (Button) findViewById(R.id.alpha);
        btnScale = (Button) findViewById(R.id.scale);
        btnTranslate = (Button) findViewById(R.id.translate);
        btnRotate = (Button) findViewById(R.id.rotate);

    }


    public static void lauch(Context mcontext){
        Intent intent=new Intent(mcontext,SampleActivity.class);
        mcontext.startActivity(intent);
    }

    private void initData() {
        btnAlpha.setOnClickListener(this);
        btnScale.setOnClickListener(this);
        btnTranslate.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
//        AlphaAnimation
//        ScaleAnimation
//        RotateAnimation
//        TranslateAnimation
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.alpha:
                mAnimation= AnimationUtils.loadAnimation(this,R.anim.alpha);
                imgPic.startAnimation(mAnimation);
                break;
            case R.id.scale:
                mAnimation=AnimationUtils.loadAnimation(this,R.anim.scale);
                imgPic.startAnimation(mAnimation);
                break;
            case R.id.translate:
                mAnimation=AnimationUtils.loadAnimation(this,R.anim.translate);
                imgPic.startAnimation(mAnimation);
                break;
            case R.id.rotate:
                mAnimation=AnimationUtils.loadAnimation(this,R.anim.rotate);
                imgPic.startAnimation(mAnimation);
                break;
        }
    }
}
