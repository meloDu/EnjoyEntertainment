package com.smart.melo.enjoyentertainment.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.smart.melo.enjoyentertainment.R;
import com.smart.melo.enjoyentertainment.base.BaseFragment;
import com.smart.melo.enjoyentertainment.bean.VideoBean;
import com.smart.melo.enjoyentertainment.presenter.VideoPresenter;
import com.smart.melo.enjoyentertainment.view.activity.VideoShowActivity;
import com.smart.melo.enjoyentertainment.view.adapter.VideoAdapter;
import com.smart.melo.enjoyentertainment.view.impl.IVideoView;
import com.smart.melo.enjoyentertainment.weight.CoustomLoadDialog;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by melo on 2017/3/6.
 */
public class VideoFragment extends BaseFragment<IVideoView, VideoPresenter> implements IVideoView, VideoAdapter.ItemClickListener {
    private static final String FRAGMENT_INDEX = "outState";
    /**
     * 标志位，标志已经初始化完成
     */
    private boolean isPrepared;

    /**
     * 是否已被加载过一次，第二次就不再去请求数据了
     */
    private boolean mHasLoadedOnce;

    /**
     * list用在存放数据
     */
    private List<VideoBean.ListBean> videoList;

    private CoustomLoadDialog progressDialog;

    @Bind(R.id.rv_fragment_video)
    RecyclerView mRvFragmentVideo;

    public static VideoFragment newInstance() {
        Bundle args = new Bundle();
        VideoFragment fragment = new VideoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private VideoPresenter mVideoPresenter;


    @Override
    public VideoPresenter initPresenter() {
        mVideoPresenter = new VideoPresenter(this);
        return mVideoPresenter;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_video;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        isPrepared = true;

    }


    @Override
    public void getVideoOnSuccess(VideoBean videoBean) {
        //加载成功，关闭loading，基类中的方法
        stopProgressDialog();
        mHasLoadedOnce = true;

        videoList = videoBean.getList();
        //设置数据到view
        setView();


    }

    /**
     * 加载view
     */
    private void setView() {
        VideoAdapter adapter = new VideoAdapter(getActivity(), videoList);
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 1, GridLayoutManager.VERTICAL, false);
        mRvFragmentVideo.setLayoutManager(manager);
        mRvFragmentVideo.setAdapter(adapter);
        adapter.setListener(this);
    }


    @Override
    public void onFail(String msg) {
        Log.i("tag", msg);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        Log.i("tag", "销毁了");
        mHasLoadedOnce = false;
    }


    @Override
    public void onLayoutListener(View view, int position) {
        Toast.makeText(getActivity(), "layout的点击事件:" + position + "", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getActivity(), VideoShowActivity.class);
        intent.putExtra("videoUrl", videoList.get(position).getVideourl());
        intent.putExtra("imageUrl", videoList.get(position).getTitlepic());
//        intent.putExtra("videoList", (Serializable) videoList);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


    @Override
    protected void lazyLoad() {
        Log.i("tag", "isPrepared:" + isPrepared + ",isVisible:" + isVisible + ",mHasLoadedOnce:" + mHasLoadedOnce);
        if (!isPrepared || !isVisible || mHasLoadedOnce) {
            return;
        }
        //开启loading，基类中的方法
        startProgressDialog();
        //下载数据
        mVideoPresenter.getVideo();


    }


//    private void startProgressDialog() {
//        if (progressDialog == null) {
//            progressDialog = new CoustomLoadDialog(getActivity()).createDialog();
//        }
//
//        progressDialog.show();
//    }
//
//    private void stopProgressDialog() {
//        if (progressDialog != null) {
//            progressDialog.dismiss();
//            progressDialog = null;
//        }
//    }


}
