package com.zjx.readlife.ireader.ui.adapter;

import android.content.Context;

import com.zjx.readlife.ireader.model.bean.SortBookBean;
import com.zjx.readlife.ireader.ui.adapter.view.BookSortListHolder;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;
import com.zjx.readlife.ireader.widget.adapter.WholeAdapter;

/**
 * Created by readlife on 17-5-3.
 */

public class BookSortListAdapter extends WholeAdapter<SortBookBean>{
    public BookSortListAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<SortBookBean> createViewHolder(int viewType) {
        return new BookSortListHolder();
    }
}
