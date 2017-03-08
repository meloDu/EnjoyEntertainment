package com.smart.melo.enjoyentertainment.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smart.melo.enjoyentertainment.weight.CoustomLoadDialog;

import butterknife.ButterKnife;

/**
 * Created by melo on 2017/3/6.
 */
public abstract class BaseFragment<V, T extends BasePresenter<V>> extends Fragment {

    /**
     * Fragment当前状态是否可见
     * setUserVisibleHint  adapter中的每个fragment切换的时候都会被调用，
     * 如果是切换到当前页，那么isVisibleToUser==true，否则为false
     */
    protected boolean isVisible;
    /**
     * 自定义loading
     */
    protected CoustomLoadDialog progressDialog;

    public T presenter;
    public static final String FRAGMENT_OUT_STATE = "outState";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = initPresenter();
        presenter.attachView((V) this);
        if (savedInstanceState != null) {
            if (savedInstanceState.getBoolean(FRAGMENT_OUT_STATE)) {
                getFragmentManager().beginTransaction().show(this).commit();
            } else {
                getFragmentManager().beginTransaction().hide(this).commit();
            }
        }
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            isVisible = true;
            onVisible();
        } else {
            isVisible = false;
            onInvisible();
        }
    }

    /**
     * 可见
     */
    protected void onVisible() {
        lazyLoad();
    }

    /**
     * 不可见
     */
    protected void onInvisible() {

    }

    /**
     * 延迟加载	 * 子类必须重写此方法
     */
    protected abstract void lazyLoad();


    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putBoolean(FRAGMENT_OUT_STATE, isVisible());
    }

    public abstract T initPresenter();

    public abstract int getLayoutId();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        ButterKnife.bind(this, view);
        init();

        return view;
    }


    public final void init() {
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();


    /**
     * 生成dialog
     */
    protected void startProgressDialog() {
        if (progressDialog == null) {
            progressDialog = new CoustomLoadDialog(getActivity()).createDialog();
        }

        progressDialog.show();
    }
    /**
     * 关闭dialog
     */
    protected void stopProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
        }
    }




    @Override
    public void onDestroy() {

        super.onDestroy();
        if (presenter != null) {
            presenter.detachView();
            presenter = null;
        }
    }
}
