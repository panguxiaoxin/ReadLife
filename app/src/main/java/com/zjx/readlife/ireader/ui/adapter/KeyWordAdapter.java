package com.zjx.readlife.ireader.ui.adapter;

import com.zjx.readlife.ireader.ui.adapter.view.KeyWordHolder;
import com.zjx.readlife.ireader.ui.base.adapter.BaseListAdapter;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by readlife on 17-6-2.
 */

public class KeyWordAdapter extends BaseListAdapter<String> {
    @Override
    protected IViewHolder<String> createViewHolder(int viewType) {
        return new KeyWordHolder();
    }
}
