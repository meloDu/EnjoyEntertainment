package com.smart.melo.enjoyentertainment.view.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.smart.melo.enjoyentertainment.R;
import com.smart.melo.enjoyentertainment.base.BaseFragment;
import com.smart.melo.enjoyentertainment.presenter.QuickMsgPresenter;
import com.smart.melo.enjoyentertainment.view.adapter.QuickMsgPagerAdapter;
import com.smart.melo.enjoyentertainment.view.impl.IQuickMsgView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by melo on 2017/3/6.
 * 快讯
 */
public class QuickMsgFragment extends BaseFragment<IQuickMsgView, QuickMsgPresenter> implements IQuickMsgView {


    @Bind(R.id.viewpager_fragment_quickmsg)
    ViewPager mViewpager;
    @Bind(R.id.tablayout_fragment_quickmsg)
    TabLayout mTablayout;



    private QuickMsgPresenter mQuickMsgPresenter;

    public static QuickMsgFragment newInstance() {
        Bundle args = new Bundle();
        QuickMsgFragment fragment = new QuickMsgFragment();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public QuickMsgPresenter initPresenter() {
        mQuickMsgPresenter = new QuickMsgPresenter(this);

        return mQuickMsgPresenter;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_quickmsg;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

        //初始化  获取fragments数据源  然后进行适配
        initViewPager();
        String[] titles = getResources().getStringArray(R.array.hot_titles);
        QuickMsgPagerAdapter adapter = new QuickMsgPagerAdapter(fragments, titles, getChildFragmentManager());
        mViewpager.setAdapter(adapter);
        //关闭预加载，默认一次只加载一个Fragment
        mViewpager.setOffscreenPageLimit(2);
        // 设置viewpager和tablayout联动
        mViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTablayout));
        mTablayout.setupWithViewPager(mViewpager);
    }


    @Override
    public void getQuickMsgData() {

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    private List<Fragment> fragments;

    //初始化数据源
    private void initViewPager() {
        fragments = new ArrayList<>();
        fragments.add(HotFragment.newInstance());
        fragments.add(HotFragment.newInstance());
        fragments.add(VideoFragment.newInstance());
        fragments.add(HotFragment.newInstance());
        fragments.add(HotFragment.newInstance());
        fragments.add(HotFragment.newInstance());

    }

    @Override
    protected void lazyLoad() {

    }
}
