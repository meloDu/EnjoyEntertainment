package com.smart.melo.enjoyentertainment.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by melo on 2017/3/7.
 */
public class QuickMsgPagerAdapter extends FragmentPagerAdapter {
    private String[] titles;
    private List<Fragment> fragments;

    public QuickMsgPagerAdapter(List<Fragment> fragments, String[] titles, FragmentManager fm) {
        super(fm);
        this.titles=titles;
        this.fragments = fragments;
    }


    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
