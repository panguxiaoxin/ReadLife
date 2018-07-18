package com.zjx.readlife.ireader.ui.adapter;

import com.zjx.readlife.ireader.model.bean.DownloadTaskBean;
import com.zjx.readlife.ireader.ui.adapter.view.DownloadHolder;
import com.zjx.readlife.ireader.ui.base.adapter.BaseListAdapter;
import com.zjx.readlife.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by readlife on 17-5-12.
 */

public class DownLoadAdapter extends BaseListAdapter<DownloadTaskBean>{

    @Override
    protected IViewHolder<DownloadTaskBean> createViewHolder(int viewType) {
        return new DownloadHolder();
    }
}
