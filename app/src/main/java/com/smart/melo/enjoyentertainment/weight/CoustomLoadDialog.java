package com.smart.melo.enjoyentertainment.weight;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.TextView;

import com.smart.melo.enjoyentertainment.R;

/**
 * Created by melo on 2017/3/8.
 * 自定义loading
 */
public class CoustomLoadDialog extends Dialog {
    private Context context;
    private CoustomLoadDialog customProgressDialog;

    public CoustomLoadDialog(Context context) {
        super(context);
        this.context = context;
    }

    public CoustomLoadDialog(Context context, int theme) {
        super(context, theme);
    }

    public CoustomLoadDialog createDialog() {
        customProgressDialog = new CoustomLoadDialog(context, R.style.CustomProgressDialog);
        customProgressDialog.setContentView(R.layout.customprogressdialog);
        customProgressDialog.getWindow().getAttributes().gravity = Gravity.CENTER;

        return customProgressDialog;
    }

    public void onWindowFocusChanged(boolean hasFocus) {

        if (customProgressDialog == null) {
            return;
        }

        ImageView imageView = (ImageView) customProgressDialog.findViewById(R.id.loadingImageView);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();
    }

    /**
     * setTitile 标题
     *
     * @param strTitle
     * @return
     */
    public CoustomLoadDialog setTitile(String strTitle) {
        return customProgressDialog;
    }

    /**
     * setMessage 提示内容
     *
     * @param strMessage
     * @return
     */
    public CoustomLoadDialog setMessage(String strMessage) {
        TextView tvMsg = (TextView) customProgressDialog.findViewById(R.id.id_tv_loadingmsg);

        if (tvMsg != null) {
            tvMsg.setText(strMessage);
        }

        return customProgressDialog;
    }
}
