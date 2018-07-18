package com.zjx.readlife.ireader.ui.adapter;

import android.content.Context;

import com.zjx.readlife.ireader.model.bean.BookReviewBean;
import com.zjx.readlife.ireader.ui.adapter.view.DiscReviewHolder;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;
import com.zjx.readlife.ireader.widget.adapter.WholeAdapter;

/**
 * Created by readlife on 17-4-21.
 */

public class DiscReviewAdapter extends WholeAdapter<BookReviewBean> {

    public DiscReviewAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<BookReviewBean> createViewHolder(int viewType) {
        return new DiscReviewHolder();
    }
}
