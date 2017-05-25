package com.example.llcgs.android_mvvmapplication.second.viewmodel.impl;

import android.view.View;

import com.example.llcgs.android_mvvmapplication.main.model.LoginBean;
import com.example.llcgs.android_mvvmapplication.second.viewmodel.ISecondViewModel;

/**
 * com.example.llcgs.android_mvvmapplication.second.viewmodel.impl.SecondViewModelImpl
 *
 * @author liulongchao
 * @since 2017/5/23
 */


public class SecondViewModelImpl implements ISecondViewModel {

    private LoginBean loginBean;

    public SecondViewModelImpl(LoginBean loginBean) {
        this.loginBean = loginBean;
    }


    @Override
    public void onItemClick(View view) {

    }

    @Override
    public String getUser() {
        return loginBean.getName();
    }

    @Override
    public String getPwd() {
        return loginBean.getPwd();
    }
}
