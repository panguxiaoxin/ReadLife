package com.zjx.readlife.ireader.ui.adapter;

import com.zjx.readlife.ireader.model.bean.BillBookBean;
import com.zjx.readlife.ireader.ui.adapter.view.BillBookHolder;
import com.zjx.readlife.ireader.ui.base.adapter.BaseListAdapter;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by readlife on 17-5-3.
 */

public class BillBookAdapter extends BaseListAdapter<BillBookBean> {
    @Override
    protected IViewHolder<BillBookBean> createViewHolder(int viewType) {
        return new BillBookHolder();
    }
}
