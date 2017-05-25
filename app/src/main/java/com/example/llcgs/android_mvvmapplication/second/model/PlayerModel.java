package com.example.llcgs.android_mvvmapplication.second.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * com.example.llcgs.android_mvvmapplication.second.model.PlayerModel
 *
 * @author liulongchao
 * @since 2017/5/25
 */


public class PlayerModel implements Parcelable{

    private String name;
    private String age;
    private String height;
    private String sName;
    private String average;


    public PlayerModel(String name, String age, String height, String sName, String average) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sName = sName;
        this.average = average;
    }

    protected PlayerModel(Parcel in) {
        name = in.readString();
        age = in.readString();
        height = in.readString();
        sName = in.readString();
        average = in.readString();
    }

    public static final Creator<PlayerModel> CREATOR = new Creator<PlayerModel>() {
        @Override
        public PlayerModel createFromParcel(Parcel in) {
            return new PlayerModel(in);
        }

        @Override
        public PlayerModel[] newArray(int size) {
            return new PlayerModel[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(age);
        dest.writeString(height);
        dest.writeString(sName);
        dest.writeString(average);
    }
}
