package com.zjx.readlife.ireader.ui.adapter.view;

import android.widget.TextView;

import com.zjx.readlife.ireader.R;
import com.zjx.readlife.ireader.ui.base.adapter.ViewHolderImpl;

/**
 * Created by readlife on 17-5-5.
 */

public class TagGroupHolder extends ViewHolderImpl<String> {
    private TextView mTvGroupName;

    @Override
    public void initView() {
        mTvGroupName = findById(R.id.tag_group_name);
    }

    @Override
    public void onBind(String value, int pos) {
        mTvGroupName.setText(value);
    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_tag_group;
    }
}
