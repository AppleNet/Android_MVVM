package com.example.llcgs.android_mvvmapplication.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.llcgs.android_mvvmapplication.R;
import com.example.llcgs.android_mvvmapplication.databinding.ActivityMainBinding;
import com.example.llcgs.android_mvvmapplication.main.model.LoginBean;
import com.example.llcgs.android_mvvmapplication.main.view.LoginView;
import com.example.llcgs.android_mvvmapplication.second.view.SecondActivity;
import com.example.llcgs.android_mvvmapplication.main.viewmodel.LoginViewModelImpl;
import com.example.llcgs.android_mvvmapplication.main.viewmodel.impl.LoginViewModel;

public class MainActivity extends AppCompatActivity implements LoginView {

    private ActivityMainBinding activityMainBinding;
    private LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
        setSupportActionBar(activityMainBinding.toolbar);
    }

    private void initDataBinding(){
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        loginViewModel = new LoginViewModelImpl(this, activityMainBinding);
        activityMainBinding.setLoginViewModel(loginViewModel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showLoadingDialog() {
        Toast.makeText(this, "showLoadingDialog", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void dismissLoadingDialog() {
        Toast.makeText(this, "dismissLoadingDialog", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void doLoginSuccess(LoginBean loginBean) {
        Toast.makeText(this, "doLoginSuccess", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("loginBean", loginBean);
        startActivity(intent);
    }

    @Override
    public void doLoginFail() {

    }
}
