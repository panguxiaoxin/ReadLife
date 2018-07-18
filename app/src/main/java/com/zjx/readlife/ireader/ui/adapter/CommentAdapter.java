package com.zjx.readlife.ireader.ui.adapter;

import android.content.Context;

import com.zjx.readlife.ireader.model.bean.CommentBean;
import com.zjx.readlife.ireader.ui.adapter.view.CommentHolder;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;
import com.zjx.readlife.ireader.widget.adapter.WholeAdapter;

/**
 * Created by readlife on 17-4-29.
 */

public class CommentAdapter extends WholeAdapter<CommentBean> {

    public CommentAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<CommentBean> createViewHolder(int viewType) {
        return new CommentHolder(false);
    }
}
