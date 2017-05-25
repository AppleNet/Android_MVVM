package com.example.llcgs.android_mvvmapplication.second.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.example.llcgs.android_mvvmapplication.R;
import com.example.llcgs.android_mvvmapplication.second.adapter.UserAdapter;
import com.example.llcgs.android_mvvmapplication.databinding.ActivitySecondBinding;
import com.example.llcgs.android_mvvmapplication.main.model.LoginBean;
import com.example.llcgs.android_mvvmapplication.second.model.PlayerModel;
import com.example.llcgs.android_mvvmapplication.second.viewmodel.ISecondViewModel;
import com.example.llcgs.android_mvvmapplication.second.viewmodel.impl.SecondViewModelImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * com.example.llcgs.android_mvvmapplication.second.view.SecondActivity
 *
 * @author liulongchao
 * @since 2017/5/22
 */


public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding activitySecondBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
    }

    private void initDataBinding(){
        activitySecondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        LoginBean loginBean = getIntent().getParcelableExtra("loginBean");
        ISecondViewModel viewModel = new SecondViewModelImpl(loginBean);
        activitySecondBinding.setSecondViewModel(viewModel);

        UserAdapter userAdapter = new UserAdapter();
        List<PlayerModel> list = new ArrayList<>();
        for (int i=0; i<=10; i++){
            //list.add(loginBean);
            list.add(new PlayerModel(loginBean.getName(), loginBean.getPwd(), "201", "闪电", "24.5"));
        }
        userAdapter.setList(list);
        activitySecondBinding.recyclerview.setAdapter(userAdapter);
        activitySecondBinding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
    }

}
