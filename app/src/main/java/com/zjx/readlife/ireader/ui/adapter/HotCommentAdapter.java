package com.zjx.readlife.ireader.ui.adapter;

import com.zjx.readlife.ireader.model.bean.HotCommentBean;
import com.zjx.readlife.ireader.ui.adapter.view.HotCommentHolder;
import com.zjx.readlife.ireader.ui.base.adapter.BaseListAdapter;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by readlife on 17-5-4.
 */

public class HotCommentAdapter extends BaseListAdapter<HotCommentBean>{
    @Override
    protected IViewHolder<HotCommentBean> createViewHolder(int viewType) {
        return new HotCommentHolder();
    }
}
