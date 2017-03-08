package com.smart.melo.enjoyentertainment.base;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Created by melo on 2017/3/6.
 * 封装presenter基类，对view进行弱引用处理
 */
public class BasePresenter<IV> {

    private Reference<IV> view;

    public void attachView(IV v) {
        view = new WeakReference<IV>(v);
    }

    public boolean isAdd() {
        return null != view && view.get() != null;
    }

    public void detachView() {
        if (view != null) {
            view.clear();
            view = null;
        }
    }
}
