package com.example.llcgs.android_mvvmapplication.second.viewmodel;

import android.view.View;

/**
 * com.example.llcgs.android_mvvmapplication.second.viewmodel.ISecondViewModel
 *
 * @author liulongchao
 * @since 2017/5/23
 */


public interface ISecondViewModel {

    void onItemClick(View view);
    String getUser();
    String getPwd();
}
