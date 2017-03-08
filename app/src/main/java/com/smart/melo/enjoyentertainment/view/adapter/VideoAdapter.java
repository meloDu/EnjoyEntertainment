package com.smart.melo.enjoyentertainment.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.smart.melo.enjoyentertainment.R;
import com.smart.melo.enjoyentertainment.bean.VideoBean;
import com.smart.melo.enjoyentertainment.utils.ImageLoadUtils;

import java.util.List;

/**
 * Created by melo on 2017/3/7.
 */
public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {

    private List<VideoBean.ListBean> videoList;
    private Context context;

    public interface ItemClickListener {
        void onLayoutListener(View view, int position);
    }

    private ItemClickListener listener;

    public void setListener(ItemClickListener listener) {
        this.listener = listener;
    }

    public VideoAdapter(Context context, List<VideoBean.ListBean> videoList) {
        this.context = context;
        this.videoList = videoList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv_fragment_video, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String imageUrl = videoList.get(position).getTitlepic();
        String fileLength = videoList.get(position).getFilelength();
        String title = videoList.get(position).getTitle();
        holder.mTextView.setText(fileLength);
        holder.mTextView_title.setText(title);
        ImageLoadUtils.loadImage(context, holder.mImageView, imageUrl, R.mipmap.ic_launcher);
    }

    @Override
    public int getItemCount() {
        return videoList != null ? videoList.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView,mTextView_title;
        RelativeLayout mLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.iv_fragment_video);
            mTextView = (TextView) itemView.findViewById(R.id.tv_video_time);
            mTextView_title = (TextView) itemView.findViewById(R.id.tv_video_title);
            mLayout = (RelativeLayout) itemView.findViewById(R.id.layout_video);

            mLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener!=null){
                        listener.onLayoutListener(v,getLayoutPosition());
                    }
                }
            });
        }
    }
}