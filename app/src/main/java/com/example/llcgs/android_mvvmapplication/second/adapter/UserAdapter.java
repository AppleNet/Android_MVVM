package com.example.llcgs.android_mvvmapplication.second.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.llcgs.android_mvvmapplication.R;
import com.example.llcgs.android_mvvmapplication.databinding.ViewItemUserBinding;
import com.example.llcgs.android_mvvmapplication.second.model.PlayerModel;
import com.example.llcgs.android_mvvmapplication.second.viewmodel.impl.ItemViewModelImpl;

import java.util.Collections;
import java.util.List;

/**
 * com.example.llcgs.android_mvvmapplication.second.adapter.UserAdapter
 *
 * @author liulongchao
 * @since 2017/5/22
 */


public class UserAdapter extends RecyclerView.Adapter {

    private List<PlayerModel> list;

    public UserAdapter() {
        list = Collections.emptyList();
    }

    public void setList(List<PlayerModel> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewItemUserBinding viewItemUserBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.view_item_user, parent, false);
        return new UserViewHolder(viewItemUserBinding);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((UserViewHolder)holder).bindUser(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    static class UserViewHolder extends RecyclerView.ViewHolder{

        ViewItemUserBinding viewItemUserBinding;

        public UserViewHolder(ViewItemUserBinding viewItemUserBinding) {
            super(viewItemUserBinding.itemUser);
            this.viewItemUserBinding = viewItemUserBinding;
        }

        void bindUser(PlayerModel loginBean){
            if(viewItemUserBinding.getItemLoginBean() == null){
                viewItemUserBinding.setItemLoginBean(new ItemViewModelImpl(loginBean, itemView.getContext()));
            }
            viewItemUserBinding.getItemLoginBean().setLoginBean(loginBean);
        }

    }

}
