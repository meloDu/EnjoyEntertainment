package com.smart.melo.enjoyentertainment.presenter;

import com.smart.melo.enjoyentertainment.base.BasePresenter;
import com.smart.melo.enjoyentertainment.model.QuickMsgModel;
import com.smart.melo.enjoyentertainment.view.impl.IQuickMsgView;

/**
 * Created by melo on 2017/3/6.
 */
public class QuickMsgPresenter extends BasePresenter<IQuickMsgView>{
    private QuickMsgModel mQuickMsgModel;
    private IQuickMsgView mIQuickMsgView;

    public QuickMsgPresenter(IQuickMsgView mIQuickMsgView){
        this.mIQuickMsgView=mIQuickMsgView;
        mQuickMsgModel=new QuickMsgModel();
    }

    public void getQuickMsg(){
    }


}
