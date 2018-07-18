package com.zjx.readlife.ireader.model.local;

import com.zjx.readlife.ireader.model.bean.AuthorBean;
import com.zjx.readlife.ireader.model.bean.DownloadTaskBean;
import com.zjx.readlife.ireader.model.bean.packages.BillboardPackage;
import com.zjx.readlife.ireader.model.bean.ReviewBookBean;
import com.zjx.readlife.ireader.model.bean.BookCommentBean;
import com.zjx.readlife.ireader.model.bean.BookHelpfulBean;
import com.zjx.readlife.ireader.model.bean.BookHelpsBean;
import com.zjx.readlife.ireader.model.bean.BookReviewBean;
import com.zjx.readlife.ireader.model.bean.packages.BookSortPackage;

import java.util.List;

/**
 * Created by readlife on 17-4-28.
 */

public interface SaveDbHelper {
    void saveBookComments(List<BookCommentBean> beans);
    void saveBookHelps(List<BookHelpsBean> beans);
    void saveBookReviews(List<BookReviewBean> beans);
    void saveAuthors(List<AuthorBean> beans);
    void saveBooks(List<ReviewBookBean> beans);
    void saveBookHelpfuls(List<BookHelpfulBean> beans);

    void saveBookSortPackage(BookSortPackage bean);
    void saveBillboardPackage(BillboardPackage bean);
    /*************DownloadTask*********************/
    void saveDownloadTask(DownloadTaskBean bean);
}
