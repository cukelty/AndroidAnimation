package com.tianyuan.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tianyuan.animation.custom.CustomActivity;
import com.tianyuan.animation.ui.AnimationListActivity;
import com.tianyuan.animation.ui.JumpActivity;
import com.tianyuan.animation.ui.SampleActivity;
import com.tianyuan.animation.ui.View2Activity;
import com.tianyuan.animation.ui.propertyActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mButton_example,mButton_animationlist,mButton_custom,mButton_view,mButton_view2,mButton_property;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initDate();
        

    }


    private void initView() {
        mButton_animationlist= (Button) findViewById(R.id.animation_list);
        mButton_example= (Button) findViewById(R.id.to_example);
        mButton_custom=(Button)findViewById(R.id.custom_animation);
        mButton_view=(Button)findViewById(R.id.View_animation);
        mButton_view2=(Button)findViewById(R.id.View_animation2);
        mButton_property= (Button) findViewById(R.id.propert_animation);
    }

    private void initDate() {
        mButton_example.setOnClickListener(this);
        mButton_animationlist.setOnClickListener(this);
        mButton_custom.setOnClickListener(this);
        mButton_view.setOnClickListener(this);
        mButton_view2.setOnClickListener(this);
        mButton_property.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.animation_list:
                AnimationListActivity.lauch(this);
                break;
            case R.id.to_example:
                SampleActivity.lauch(this);
                break;

            case R.id.custom_animation:
                CustomActivity.lauch(this);
                break;

            case R.id.View_animation:
                JumpActivity.lauch(this);
                break;

            case R.id.View_animation2:
                View2Activity.lauch(this);
                break;

            case R.id.propert_animation:
                propertyActivity.lauch(this);
                break;
        }
    }
}
