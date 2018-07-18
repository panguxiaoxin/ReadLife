package com.zjx.readlife.ireader.presenter.contract;

import com.zjx.readlife.ireader.model.bean.packages.BookSortPackage;
import com.zjx.readlife.ireader.model.bean.packages.BookSubSortPackage;
import com.zjx.readlife.ireader.ui.base.BaseContract;

/**
 * Created by readlife on 17-4-23.
 */

public interface BookSortContract {

    interface View extends BaseContract.BaseView{
        void finishRefresh(BookSortPackage sortPackage, BookSubSortPackage subSortPackage);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshSortBean();
    }
}
