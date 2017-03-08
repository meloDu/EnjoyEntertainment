package com.smart.melo.enjoyentertainment.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by melo on 2017/3/7.
 * 加载图片工具类
 */
public class ImageLoadUtils {

    public static void loadImage(Context context, ImageView imageView, String imageUrl) {
        Glide.with(context).load(imageUrl).into(imageView);
    }

    //加载失败时默认加载的图片
    public static void loadImage(Context context, ImageView imageView, String imageUrl, int defaultImgId) {
        Glide.with(context).load(imageUrl).error(defaultImgId).into(imageView);
    }
}