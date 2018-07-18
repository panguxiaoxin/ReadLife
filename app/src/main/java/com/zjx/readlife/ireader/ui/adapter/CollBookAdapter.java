package com.zjx.readlife.ireader.ui.adapter;

import com.zjx.readlife.ireader.model.bean.CollBookBean;
import com.zjx.readlife.ireader.ui.adapter.view.CollBookHolder;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;
import com.zjx.readlife.ireader.widget.adapter.WholeAdapter;

/**
 * Created by readlife on 17-5-8.
 */

public class CollBookAdapter extends WholeAdapter<CollBookBean> {

    @Override
    protected IViewHolder<CollBookBean> createViewHolder(int viewType) {
        return new CollBookHolder();
    }

}
