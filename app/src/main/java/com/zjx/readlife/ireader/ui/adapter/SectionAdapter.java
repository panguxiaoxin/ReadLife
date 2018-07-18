package com.zjx.readlife.ireader.ui.adapter;

import com.zjx.readlife.ireader.model.bean.SectionBean;
import com.zjx.readlife.ireader.ui.adapter.view.SectionHolder;
import com.zjx.readlife.ireader.ui.base.adapter.BaseListAdapter;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by readlife on 17-4-16.
 */

public class SectionAdapter extends BaseListAdapter<SectionBean> {
    @Override
    protected IViewHolder<SectionBean> createViewHolder(int viewType) {
        return new SectionHolder();
    }
}
