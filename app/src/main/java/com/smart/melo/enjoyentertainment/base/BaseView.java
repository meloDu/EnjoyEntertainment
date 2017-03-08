package com.smart.melo.enjoyentertainment.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by melo on 2017/3/6.
 * 封装基类view
 * 初始化UI,加载数据,给控件赋值
 */
public abstract class BaseView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setContentView(getLayoutId());
            ButterKnife.bind(this);
            init();
        }
    }

    public void init() {
        initView();
        initData();
    }

    public abstract void initData();

    public abstract void initView();

    public abstract int getLayoutId();
}
