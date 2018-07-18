package com.zjx.readlife.ireader.ui.adapter;

import com.zjx.readlife.ireader.model.bean.packages.SearchBookPackage;
import com.zjx.readlife.ireader.ui.adapter.view.SearchBookHolder;
import com.zjx.readlife.ireader.ui.base.adapter.BaseListAdapter;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by readlife on 17-6-2.
 */

public class SearchBookAdapter extends BaseListAdapter<SearchBookPackage.BooksBean>{
    @Override
    protected IViewHolder<SearchBookPackage.BooksBean> createViewHolder(int viewType) {
        return new SearchBookHolder();
    }
}
