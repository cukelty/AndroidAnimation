package com.tianyuan.animation.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

import com.tianyuan.animation.R;

public class View2Activity extends AppCompatActivity {


    private TextView translation;
    private TextView rotate;
    private TextView scale;
    private TextView alpha;

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2);

        translation = (TextView) findViewById(R.id.translation);
        rotate = (TextView) findViewById(R.id.rotate);
        scale = (TextView) findViewById(R.id.scale);
        alpha = (TextView) findViewById(R.id.alpha);
        button = (Button) findViewById(R.id.fire);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // 1&2: 确定起始状态，结束状态
                TranslateAnimation tAnim = new TranslateAnimation(0, 400, 0, 0);//横向位移400个单位
                RotateAnimation rAnima = new RotateAnimation(0, 70);//顺时针旋转70度
                ScaleAnimation sAnima = new ScaleAnimation(0, 5, 0, 5);//横向放大5倍，纵向放大5倍
                AlphaAnimation aAnima = new AlphaAnimation(1.0f, 0.0f);//从全不透明变为全透明
                // 3: 确定持续时间
                tAnim.setDuration(2000);
                rAnima.setDuration(2000);
                sAnima.setDuration(2000);
                aAnima.setDuration(2000);

                // 4: 确定Interpolator
                tAnim.setInterpolator(new AccelerateDecelerateInterpolator());

                // 启动动画
                translation.startAnimation(tAnim);
                rotate.startAnimation(rAnima);
                scale.startAnimation(sAnima);
                alpha.startAnimation(aAnima);
            }
        });



    }


    public static void lauch(Context mcontext){
        Intent intent=new Intent(mcontext,View2Activity.class);
        mcontext.startActivity(intent);
    }
}
