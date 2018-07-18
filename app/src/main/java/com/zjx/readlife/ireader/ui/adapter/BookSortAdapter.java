package com.zjx.readlife.ireader.ui.adapter;

import com.zjx.readlife.ireader.model.bean.BookSortBean;
import com.zjx.readlife.ireader.ui.adapter.view.BookSortHolder;
import com.zjx.readlife.ireader.ui.base.adapter.BaseListAdapter;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by readlife on 17-4-23.
 */

public class BookSortAdapter extends BaseListAdapter<BookSortBean>{

    @Override
    protected IViewHolder<BookSortBean> createViewHolder(int viewType) {
        return new BookSortHolder();
    }
}
