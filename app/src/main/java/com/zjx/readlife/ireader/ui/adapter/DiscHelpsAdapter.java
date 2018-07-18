package com.zjx.readlife.ireader.ui.adapter;

import android.content.Context;

import com.zjx.readlife.ireader.model.bean.BookHelpsBean;
import com.zjx.readlife.ireader.ui.adapter.view.DiscHelpsHolder;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;
import com.zjx.readlife.ireader.widget.adapter.WholeAdapter;

/**
 * Created by readlife on 17-4-21.
 */

public class DiscHelpsAdapter extends WholeAdapter<BookHelpsBean>{

    public DiscHelpsAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<BookHelpsBean> createViewHolder(int viewType) {
        return new DiscHelpsHolder();
    }
}
