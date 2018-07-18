package com.zjx.readlife.ireader.ui.adapter;

import com.zjx.readlife.ireader.model.bean.CommentBean;
import com.zjx.readlife.ireader.ui.adapter.view.CommentHolder;
import com.zjx.readlife.ireader.ui.base.adapter.BaseListAdapter;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by readlife on 17-4-29.
 */

public class GodCommentAdapter extends BaseListAdapter<CommentBean>{
    @Override
    protected IViewHolder<CommentBean> createViewHolder(int viewType) {
        return new CommentHolder(true);
    }
}
