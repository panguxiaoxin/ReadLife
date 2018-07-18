package com.zjx.readlife.ireader.presenter.contract;

import com.zjx.readlife.ireader.model.bean.BookListDetailBean;
import com.zjx.readlife.ireader.ui.base.BaseContract;

/**
 * Created by readlife on 17-5-1.
 */

public interface BookListDetailContract {

    interface View extends BaseContract.BaseView{
        void finishRefresh(BookListDetailBean bean);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshBookListDetail(String detailId);
    }
}
