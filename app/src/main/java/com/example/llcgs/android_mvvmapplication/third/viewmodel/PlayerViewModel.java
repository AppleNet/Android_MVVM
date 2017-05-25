package com.example.llcgs.android_mvvmapplication.third.viewmodel;

import com.example.llcgs.android_mvvmapplication.second.model.PlayerModel;

/**
 * com.example.llcgs.android_mvvmapplication.third.viewmodel.PlayerViewModel
 *
 * @author liulongchao
 * @since 2017/5/25
 */


public class PlayerViewModel {

    private PlayerModel playerModel;


    public PlayerViewModel(PlayerModel playerModel) {
        this.playerModel = playerModel;
    }

    public String getName(){
        return playerModel.getName();
    }

    public String getAge(){
        return playerModel.getAge();
    }
}
