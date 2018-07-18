package com.zjx.readlife.ireader.ui.adapter;

import android.content.Context;

import com.zjx.readlife.ireader.model.bean.BookListDetailBean;
import com.zjx.readlife.ireader.ui.adapter.view.BookListInfoHolder;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;
import com.zjx.readlife.ireader.widget.adapter.WholeAdapter;

/**
 * Created by readlife on 17-5-2.
 */

public class BookListDetailAdapter extends WholeAdapter<BookListDetailBean.BooksBean.BookBean> {
    public BookListDetailAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<BookListDetailBean.BooksBean.BookBean> createViewHolder(int viewType) {
        return new BookListInfoHolder();
    }
}
