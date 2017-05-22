package com.example.llcgs.android_mvvmapplication.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.llcgs.android_mvvmapplication.R;
import com.example.llcgs.android_mvvmapplication.databinding.ActivitySecondBinding;
import com.example.llcgs.android_mvvmapplication.model.LoginBean;

/**
 * com.example.llcgs.android_mvvmapplication.view.SecondActivity
 *
 * @author liulongchao
 * @since 2017/5/22
 */


public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding activitySecondBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
    }

    private void initDataBinding(){
        activitySecondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        LoginBean loginBean = getIntent().getParcelableExtra("loginBean");
        activitySecondBinding.setLoginBean(loginBean);
    }
}
