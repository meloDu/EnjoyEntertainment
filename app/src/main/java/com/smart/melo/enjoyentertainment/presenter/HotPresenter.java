package com.smart.melo.enjoyentertainment.presenter;

import com.smart.melo.enjoyentertainment.base.BasePresenter;
import com.smart.melo.enjoyentertainment.model.HotModel;
import com.smart.melo.enjoyentertainment.view.impl.IHotView;

/**
 * Created by melo on 2017/3/7.
 * 热点
 */
public class HotPresenter extends BasePresenter<IHotView> {
    private HotModel mHotModel;
    private IHotView mIHotView;

    public HotPresenter(IHotView mIHotView){
        this.mIHotView=mIHotView;
        mHotModel=new HotModel();
    }


}
