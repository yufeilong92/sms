package com.example.administrator.zhbj.Fragment;

import android.view.View;

import com.example.administrator.zhbj.R;

/**
 * Created by Administrator on 2016/6/24.
 */
public class LeftMenuFragment extends BaseFragment {
    /**
     * 方法初始化片段的控件
     * @return
     */
    @Override
    public View initview() {
        View view=View.inflate(mActivity, R.layout.frament_left_menu,null);
        return view;
    }

}
