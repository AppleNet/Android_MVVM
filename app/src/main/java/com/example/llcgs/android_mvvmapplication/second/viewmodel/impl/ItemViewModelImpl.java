package com.example.llcgs.android_mvvmapplication.second.viewmodel.impl;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.llcgs.android_mvvmapplication.second.model.PlayerModel;
import com.example.llcgs.android_mvvmapplication.second.viewmodel.IItemViewModel;
import com.example.llcgs.android_mvvmapplication.third.view.ThridActivity;

/**
 * com.example.llcgs.android_mvvmapplication.second.viewmodel.impl.ItemViewModelImpl
 *
 * @author liulongchao
 * @since 2017/5/25
 */


public class ItemViewModelImpl implements IItemViewModel {

    private PlayerModel loginBean;
    private Context context;

    public ItemViewModelImpl(PlayerModel loginBean, Context context) {
        this.loginBean = loginBean;
        this.context = context;
    }

    public PlayerModel getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(PlayerModel loginBean) {
        this.loginBean = loginBean;
    }

    public String getName(){
        return loginBean.getName();
    }

    public String getAge(){
        return loginBean.getAge();
    }

    @Override
    public void onItemClick(View view) {
        Intent intent = new Intent(context, ThridActivity.class);
        intent.putExtra("loginBean", loginBean);
        context.startActivity(intent);
    }
}
