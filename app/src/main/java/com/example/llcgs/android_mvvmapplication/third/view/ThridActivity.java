package com.example.llcgs.android_mvvmapplication.third.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.example.llcgs.android_mvvmapplication.R;

/**
 * com.example.llcgs.android_mvvmapplication.third.view.ThridActivity
 *
 * @author liulongchao
 * @since 2017/5/23
 */


public class ThridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_third);

    }
}
