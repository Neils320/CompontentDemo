package com.moudlea;

import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.basemodule.ARouterManager;
import com.basemodule.BaseActivity;

/**
 * Created by wangwei on 2018/4/17.
 */

@Route(path = ARouterManager.AModuleActivity, group = "customGroup")
public class AModuleActivity extends BaseActivity {
    TextView txt;

    @Override
    protected int getLayoutId() {
        return R.layout.a_module_layout;
    }

    @Override
    protected void initView() {
        txt = findViewById(R.id.txt);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }
}
