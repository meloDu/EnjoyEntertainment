package com.smart.melo.enjoyentertainment.view.activity;

import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.smart.melo.enjoyentertainment.R;
import com.smart.melo.enjoyentertainment.base.BaseActivity;
import com.smart.melo.enjoyentertainment.utils.BottomTabManager;
import com.smart.melo.enjoyentertainment.utils.StatusBarUtils;
import com.smart.melo.enjoyentertainment.view.fragment.QuickMsgFragment;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.Bind;

public class MainActivity extends BaseActivity implements BottomTabManager.OnBottomTabSelectListener {
    private static final String TAG = "MainActivity";
    //默认选中的页面下标
    public static final int CHECK_HOME_INDEX = 0;
    @Bind(R.id.layout_content)
    FrameLayout mLayoutContent;
    @Bind(R.id.bottom_homepage_rbtn)
    RadioButton mBottomHomepageRbtn;
    @Bind(R.id.bottom_specialsale_rbtn)
    RadioButton mBottomSpecialsaleRbtn;
    @Bind(R.id.bottom_project_rbtn)
    RadioButton mBottomProjectRbtn;
    @Bind(R.id.bottom_mycate_rbtn)
    RadioButton mBottomMycateRbtn;
    @Bind(R.id.radiogroup_bottom)
    RadioGroup mRadiogroupBottom;


    @Override
    public void initData() {

    }

    @Override
    public void initView() {
        //设置系统状态栏颜色
        StatusBarUtils.setWindowStatusBarColor(this, R.color.red);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(QuickMsgFragment.newInstance());
        fragments.add(QuickMsgFragment.newInstance());
        fragments.add(QuickMsgFragment.newInstance());
        fragments.add(QuickMsgFragment.newInstance());
        new BottomTabManager(fragments, mRadiogroupBottom, getSupportFragmentManager(),
                R.id.layout_content
                , this);


    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onBottomTabSelectListener(RadioGroup group, int checkedId, int index) {
        switch (index) {
            case CHECK_HOME_INDEX:
                break;
        }
    }






    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitBy2Click();      //调用双击退出函数
        }
        return false;
    }

    /**
     * 双击退出函数
     */
    private static Boolean isExit = false;

    private void exitBy2Click() {
        Timer tExit = null;
        if (isExit == false) {
            isExit = true; // 准备退出
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            tExit = new Timer();
            tExit.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false; // 取消退出
                }
            }, 2000); // 如果2秒钟内没有按下返回键，则启动定时器取消掉刚才执行的任务
        } else {
            finish();
            System.exit(0);
        }
    }
}
