package com.zjx.readlife.ireader.ui.adapter.view;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zjx.readlife.ireader.R;
import com.zjx.readlife.ireader.model.bean.packages.SearchBookPackage;
import com.zjx.readlife.ireader.ui.base.adapter.ViewHolderImpl;
import com.zjx.readlife.ireader.utils.Constant;

/**
 * Created by readlife on 17-6-2.
 */

public class SearchBookHolder extends ViewHolderImpl<SearchBookPackage.BooksBean> {

    private ImageView mIvCover;
    private TextView mTvName;
    private TextView mTvBrief;

    @Override
    public void initView() {
        mIvCover = findById(R.id.search_book_iv_cover);
        mTvName = findById(R.id.search_book_tv_name);
        mTvBrief = findById(R.id.search_book_tv_brief);
    }

    @Override
    public void onBind(SearchBookPackage.BooksBean data, int pos) {
        //显示图片
        Glide.with(getContext())
                .load(Constant.IMG_BASE_URL + data.getCover())
                .placeholder(R.drawable.ic_book_loading)
                .error(R.drawable.ic_load_error)
                .into(mIvCover);

        mTvName.setText(data.getTitle());

        mTvBrief.setText(getContext().getString(R.string.nb_search_book_brief,
                data.getLatelyFollower(),data.getRetentionRatio(),data.getAuthor()));
    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_search_book;
    }
}
