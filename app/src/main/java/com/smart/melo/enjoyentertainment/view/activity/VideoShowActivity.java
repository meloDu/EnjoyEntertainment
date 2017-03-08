package com.smart.melo.enjoyentertainment.view.activity;

import com.smart.melo.enjoyentertainment.R;
import com.smart.melo.enjoyentertainment.base.BaseActivity;
import com.smart.melo.enjoyentertainment.utils.ImageLoadUtils;

import butterknife.Bind;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by melo on 2017/3/7.
 */
public class VideoShowActivity extends BaseActivity {

    @Bind(R.id.jiecao_play)
    JCVideoPlayerStandard mJiecaoPlay;

    @Override
    public void initData() {
        String videoUrl = getIntent().getStringExtra("videoUrl");
        String imageUrl = getIntent().getStringExtra("imageUrl");
        ImageLoadUtils.loadImage(this,mJiecaoPlay.thumbImageView,imageUrl);
        mJiecaoPlay.setUp(videoUrl,"");
    }

    @Override
    public void initView() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_videoshow;
    }


}
