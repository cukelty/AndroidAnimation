package com.tianyuan.animation.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.tianyuan.animation.R;

public class AnimationListActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imgPic;
    private Button btnStart, btnStop;
    private AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_list);

        intiView();

        initData();
    }



    public static void lauch(Context mcontext){
        Intent intent=new Intent(mcontext,AnimationListActivity.class);
        mcontext.startActivity(intent);
    }
    /**
     * 初始化组件
     */
    private void intiView() {
        imgPic = (ImageView) findViewById(R.id.imgpic);
        btnStart = (Button) findViewById(R.id.start);
        btnStop = (Button) findViewById(R.id.stop);
    }

    /**
     * 初始化数据
     */
    private void initData() {
        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);

        imgPic.setImageResource(R.drawable.animation);
        //给动画资源赋值
        animationDrawable = (AnimationDrawable) imgPic.getDrawable();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start:
                animationDrawable.start();//开始
                break;

            case R.id.stop:
                animationDrawable.stop(); //停止
                break;
        }
    }
}
