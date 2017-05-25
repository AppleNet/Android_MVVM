package com.example.llcgs.android_mvvmapplication.third.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.example.llcgs.android_mvvmapplication.R;
import com.example.llcgs.android_mvvmapplication.databinding.ActivityThirdBinding;
import com.example.llcgs.android_mvvmapplication.second.model.PlayerModel;
import com.example.llcgs.android_mvvmapplication.third.viewmodel.PlayerViewModel;

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
        ActivityThirdBinding activityThirdBinding = DataBindingUtil.setContentView(this, R.layout.activity_third);
        Intent intent = getIntent();
        PlayerModel pal = intent.getParcelableExtra("loginBean");
        PlayerViewModel palyerVM = new PlayerViewModel(pal);
        activityThirdBinding.setPalyer(palyerVM);
    }
}
