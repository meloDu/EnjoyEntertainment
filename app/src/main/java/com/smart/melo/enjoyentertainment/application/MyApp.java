package com.smart.melo.enjoyentertainment.application;

import android.app.Application;
import android.content.Context;

import com.smart.melo.enjoyentertainment.utils.SharePreUtils;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by melo on 2017/3/6.
 */
public class MyApp extends Application {
    public static Context mContext;


    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();

        //内存泄漏检测
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);


        //判断是否第一次运行
        boolean first = (boolean) SharePreUtils.get(mContext, "first", true);
        if (first){
            //进入yindao引导页面，并改变sp内的值
            SharePreUtils.put(mContext,"first",false);

        }


    }
}
