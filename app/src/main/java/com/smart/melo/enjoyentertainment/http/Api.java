package com.smart.melo.enjoyentertainment.http;

import com.smart.melo.enjoyentertainment.bean.VideoBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by melo on 2017/3/6.
 * 定义数据接口
 */
public interface Api {
    @GET(UrlConfig.VIDEO)
    Call<VideoBean> getVideoData();

}
