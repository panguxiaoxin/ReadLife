package com.zjx.readlife.ireader.ui.activity;

import android.support.v7.widget.Toolbar;

import com.zjx.readlife.ireader.R;
import com.zjx.readlife.ireader.ui.base.BaseActivity;

/**
 * Created by readlife on 17-5-26.
 */

public class CommunityActivity extends BaseActivity{

    @Override
    protected int getContentId() {
        return R.layout.activity_community;
    }

    @Override
    protected void setUpToolbar(Toolbar toolbar) {
        super.setUpToolbar(toolbar);
        getSupportActionBar().setTitle("社区");
    }
}
