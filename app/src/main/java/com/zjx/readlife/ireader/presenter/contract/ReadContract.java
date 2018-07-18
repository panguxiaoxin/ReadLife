package com.zjx.readlife.ireader.presenter.contract;

import com.zjx.readlife.ireader.model.bean.BookChapterBean;
import com.zjx.readlife.ireader.ui.base.BaseContract;
import com.zjx.readlife.ireader.widget.page.TxtChapter;

import java.util.List;

/**
 * Created by readlife on 17-5-16.
 */

public interface ReadContract extends BaseContract{
    interface View extends BaseContract.BaseView {
        void showCategory(List<BookChapterBean> bookChapterList);
        void finishChapter();
        void errorChapter();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void loadCategory(String bookId);
        void loadChapter(String bookId,List<TxtChapter> bookChapterList);
    }
}
