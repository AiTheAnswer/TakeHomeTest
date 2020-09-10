package com.allen.takehometest.view;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.allen.common.base.BaseActivity;
import com.allen.core_basic.mvp.BasicPresenter;
import com.allen.core_basic.mvp.IBasicView;
import com.allen.takehometest.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Allen
 * on 2020/9/7
 */
public class MainActivity extends BaseActivity {
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitleVisible(false);
        initView();

    }

    private void initView(){
    }
    @Override
    public boolean getIsFullScreen() {
        return true;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @NotNull
    @Override
    public BasicPresenter<IBasicView> setPresenter() {
        return null;
    }
}
