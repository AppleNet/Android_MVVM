package com.example.llcgs.android_mvvmapplication.main.viewmodel;

import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.llcgs.android_mvvmapplication.databinding.ActivityMainBinding;
import com.example.llcgs.android_mvvmapplication.main.model.LoginBean;
import com.example.llcgs.android_mvvmapplication.main.view.LoginView;
import com.example.llcgs.android_mvvmapplication.main.viewmodel.impl.LoginViewModel;

/**
 * com.example.llcgs.android_mvvmapplication.main.viewmodel.LoginViewModelImpl
 *
 * @author liulongchao
 * @since 2017/5/22
 */


public class LoginViewModelImpl implements LoginViewModel{

    private LoginView loginView;
    private EditText nameEt,pwdEt;
    private ActivityMainBinding activityMainBinding;

    public LoginViewModelImpl(LoginView loginView) {
        this.loginView = loginView;
    }

    public LoginViewModelImpl(LoginView loginView, EditText nameEt, EditText pwdEt) {
        this.loginView = loginView;
        this.nameEt = nameEt;
        this.pwdEt = pwdEt;
    }

    public LoginViewModelImpl(LoginView loginView, ActivityMainBinding activityMainBinding) {
        this.loginView = loginView;
        this.activityMainBinding = activityMainBinding;
    }

    @Override
    public void doLogin(LoginBean loginBean) {
        loginView.showLoadingDialog();
        Log.d("GomeXG", "name: "+loginBean.getName());
        Log.d("GomeXG", "pwd: "+loginBean.getPwd());
        loginView.doLoginSuccess(loginBean);
        loginView.dismissLoadingDialog();
    }

    @Override
    public void loginButtonClick(View view) {
        LoginBean loginBean = new LoginBean();
        loginBean.setName(activityMainBinding.name.getText().toString());
        loginBean.setPwd(activityMainBinding.pwd.getText().toString());
        doLogin(loginBean);
    }

    @Override
    public void floattingButtonClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
