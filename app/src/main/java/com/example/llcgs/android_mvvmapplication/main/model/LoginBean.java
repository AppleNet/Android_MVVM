package com.example.llcgs.android_mvvmapplication.main.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * com.example.llcgs.android_mvvmapplication.main.model.LoginBean
 *
 * @author liulongchao
 * @since 2017/5/22
 */


public class LoginBean implements Parcelable{

    private String name;
    private String pwd;

    protected LoginBean(Parcel in) {
        name = in.readString();
        pwd = in.readString();
    }

    public LoginBean(){}

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(pwd);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<LoginBean> CREATOR = new Creator<LoginBean>() {
        @Override
        public LoginBean createFromParcel(Parcel in) {
            return new LoginBean(in);
        }

        @Override
        public LoginBean[] newArray(int size) {
            return new LoginBean[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
