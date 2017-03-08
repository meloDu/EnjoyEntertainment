package com.smart.melo.enjoyentertainment.view.impl;

import com.smart.melo.enjoyentertainment.bean.VideoBean;

/**
 * Created by melo on 2017/3/7.
 */
public interface IVideoView {

    void getVideoOnSuccess(VideoBean videoBean);
    void onFail(String msg);
}
