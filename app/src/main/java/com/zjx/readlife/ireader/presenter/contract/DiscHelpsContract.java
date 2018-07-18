package com.zjx.readlife.ireader.presenter.contract;

import com.zjx.readlife.ireader.model.bean.BookHelpsBean;
import com.zjx.readlife.ireader.model.flag.BookDistillate;
import com.zjx.readlife.ireader.model.flag.BookSort;
import com.zjx.readlife.ireader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by readlife on 17-4-21.
 */

public interface DiscHelpsContract {

    interface View extends BaseContract.BaseView{
        void finishRefresh(List<BookHelpsBean> beans);
        void finishLoading(List<BookHelpsBean> beans);
        void showErrorTip();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void firstLoading(BookSort sort, int start, int limited, BookDistillate distillate);
        void refreshBookHelps(BookSort sort, int start, int limited, BookDistillate distillate);
        void loadingBookHelps(BookSort sort, int start,int limited,BookDistillate distillate);
        void saveBookHelps(List<BookHelpsBean> beans);
    }
}
