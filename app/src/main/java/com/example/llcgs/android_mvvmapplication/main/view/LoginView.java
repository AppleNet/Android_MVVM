package com.example.llcgs.android_mvvmapplication.main.view;

import com.example.llcgs.android_mvvmapplication.main.model.LoginBean;

/**
 * com.example.llcgs.android_mvvmapplication.main.view.LoginView
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
