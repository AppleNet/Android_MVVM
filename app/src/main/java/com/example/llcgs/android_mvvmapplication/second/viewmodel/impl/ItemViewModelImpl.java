package com.example.llcgs.android_mvvmapplication.second.viewmodel.impl;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.llcgs.android_mvvmapplication.main.model.LoginBean;
import com.example.llcgs.android_mvvmapplication.second.viewmodel.IItemViewModel;
import com.example.llcgs.android_mvvmapplication.third.view.ThridActivity;

/**
 * com.example.llcgs.android_mvvmapplication.second.viewmodel.impl.ItemViewModelImpl
 *
 * @author liulongchao
 * @since 2017/5/25
 */


public class ItemViewModelImpl implements IItemViewModel {

    private LoginBean loginBean;
    private Context context;

    public ItemViewModelImpl(LoginBean loginBean, Context context) {
        this.loginBean = loginBean;
        this.context = context;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public String getName(){
        return loginBean.getName();
    }

    public String getPwd(){
        return loginBean.getPwd();
    }

    @Override
    public void onItemClick(View view) {
        Intent intent = new Intent(context, ThridActivity.class);
        intent.putExtra("loginBean", loginBean);
        context.startActivity(intent);
    }
}
