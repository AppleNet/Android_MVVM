package com.example.llcgs.android_mvvmapplication.main.viewmodel.impl;

import android.view.View;

import com.example.llcgs.android_mvvmapplication.main.model.LoginBean;

/**
 * com.example.llcgs.android_mvvmapplication.main.viewmodel.impl.LoginViewModel
 *
 * @author liulongchao
 * @since 2017/5/22
 */


public interface LoginViewModel {

    void doLogin(LoginBean loginBean);

    void loginButtonClick(View view);

    void floattingButtonClick(View view);
}
