package com.zjx.readlife.ireader.presenter.contract;

import com.zjx.readlife.ireader.model.bean.SortBookBean;
import com.zjx.readlife.ireader.model.flag.BookSortListType;
import com.zjx.readlife.ireader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by readlife on 17-5-3.
 */

public interface BookSortListContract {
    interface View extends BaseContract.BaseView{
        void finishRefresh(List<SortBookBean> beans);
        void finishLoad(List<SortBookBean> beans);
        void showLoadError();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshSortBook(String gender, BookSortListType type, String major, String minor, int start, int limit);
        void loadSortBook(String gender,BookSortListType type,String major,String minor,int start,int limit);
    }
}
