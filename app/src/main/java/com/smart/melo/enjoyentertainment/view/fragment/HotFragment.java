package com.smart.melo.enjoyentertainment.view.fragment;

import android.os.Bundle;

import com.smart.melo.enjoyentertainment.R;
import com.smart.melo.enjoyentertainment.base.BaseFragment;
import com.smart.melo.enjoyentertainment.presenter.HotPresenter;
import com.smart.melo.enjoyentertainment.view.impl.IHotView;

/**
 * Created by melo on 2017/3/6.
 */
public class HotFragment extends BaseFragment<IHotView, HotPresenter> implements IHotView {

    private HotPresenter mHotPresenter;

    public static HotFragment newInstance() {
        Bundle args = new Bundle();
        HotFragment fragment = new HotFragment();
        fragment.setArguments(args);
        return fragment;
    }




    @Override
    public HotPresenter initPresenter() {
        mHotPresenter=new HotPresenter(this);
        return mHotPresenter;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_hot;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }


    @Override
    protected void lazyLoad() {
        if ( !isVisible ) {
            return;
        }
    }
}
