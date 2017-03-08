package com.smart.melo.enjoyentertainment.model;

import com.smart.melo.enjoyentertainment.bean.VideoBean;
import com.smart.melo.enjoyentertainment.http.RetrofitHelper;

import retrofit2.Callback;


/**
 * Created by melo on 2017/3/7.
 */
public class VideoModel {

    public void getVideoData(Callback<VideoBean> callback){
        RetrofitHelper.getInstance()
                .getService()
                .getVideoData().enqueue(callback);
    }
}
