package com.smart.melo.enjoyentertainment.presenter;

import com.smart.melo.enjoyentertainment.base.BasePresenter;
import com.smart.melo.enjoyentertainment.bean.VideoBean;
import com.smart.melo.enjoyentertainment.model.VideoModel;
import com.smart.melo.enjoyentertainment.view.impl.IVideoView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by melo on 2017/3/7.
 */
public class VideoPresenter extends BasePresenter<IVideoView> {
    private VideoModel mVideoModel;
    private IVideoView mIVideoView;

    public VideoPresenter(IVideoView videoView) {
        this.mIVideoView = videoView;
        mVideoModel = new VideoModel();
    }

    //请求video数据
    public void getVideo(){
        mVideoModel.getVideoData(new Callback<VideoBean>() {
            @Override
            public void onResponse(Call<VideoBean> call, Response<VideoBean> response) {
                if (response.isSuccessful()){
                    VideoBean videoBean=response.body();
                    if (videoBean!=null){
                        mIVideoView.getVideoOnSuccess(videoBean);
                    }

                }
            }
            @Override
            public void onFailure(Call<VideoBean> call, Throwable t) {
                        mIVideoView.onFail("onError:videobean");
            }
        });
    }
}
