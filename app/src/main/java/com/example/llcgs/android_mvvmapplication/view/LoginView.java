package com.example.llcgs.android_mvvmapplication.view;

import com.example.llcgs.android_mvvmapplication.model.LoginBean;

/**
 * com.example.llcgs.android_mvvmapplication.view.LoginView
 *
 * @author liulongchao
 * @since 2017/5/22
 */


public interface LoginView {

    void showLoadingDialog();
    void dismissLoadingDialog();
    void doLoginSuccess(LoginBean loginBean);
    void doLoginFail();

}
