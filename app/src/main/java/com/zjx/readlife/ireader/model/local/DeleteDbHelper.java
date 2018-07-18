package com.zjx.readlife.ireader.model.local;

import com.zjx.readlife.ireader.model.bean.AuthorBean;
import com.zjx.readlife.ireader.model.bean.ReviewBookBean;
import com.zjx.readlife.ireader.model.bean.BookCommentBean;
import com.zjx.readlife.ireader.model.bean.BookHelpfulBean;
import com.zjx.readlife.ireader.model.bean.BookHelpsBean;
import com.zjx.readlife.ireader.model.bean.BookReviewBean;

import java.util.List;

/**
 * Created by readlife on 17-4-28.
 */

public interface DeleteDbHelper {
    void deleteBookComments(List<BookCommentBean> beans);
    void deleteBookReviews(List<BookReviewBean> beans);
    void deleteBookHelps(List<BookHelpsBean> beans);
    void deleteAuthors(List<AuthorBean> beans);
    void deleteBooks(List<ReviewBookBean> beans);
    void deleteBookHelpful(List<BookHelpfulBean> beans);
    void deleteAll();
}
