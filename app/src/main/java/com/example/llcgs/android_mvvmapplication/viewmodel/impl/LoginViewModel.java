package com.example.llcgs.android_mvvmapplication.viewmodel.impl;

import android.view.View;

import com.example.llcgs.android_mvvmapplication.model.LoginBean;

/**
 * com.example.llcgs.android_mvvmapplication.viewmodel.impl.LoginViewModel
 *
 * @author liulongchao
 * @since 2017/5/22
 */


public interface LoginViewModel {

    void doLogin(LoginBean loginBean);

    void loginButtonClick(View view);

    void floattingButtonClick(View view);
}
