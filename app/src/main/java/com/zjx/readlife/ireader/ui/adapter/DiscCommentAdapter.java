package com.zjx.readlife.ireader.ui.adapter;

import android.content.Context;

import com.zjx.readlife.ireader.model.bean.BookCommentBean;
import com.zjx.readlife.ireader.ui.adapter.view.DiscCommentHolder;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;
import com.zjx.readlife.ireader.widget.adapter.WholeAdapter;

/**
 * Created by readlife on 17-4-20.
 */

public class DiscCommentAdapter extends WholeAdapter<BookCommentBean> {

    public DiscCommentAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<BookCommentBean> createViewHolder(int viewType) {
        return new DiscCommentHolder();
    }
}
