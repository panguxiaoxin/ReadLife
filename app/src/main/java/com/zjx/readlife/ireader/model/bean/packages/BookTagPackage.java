package com.zjx.readlife.ireader.model.bean.packages;

import com.zjx.readlife.ireader.model.bean.BaseBean;
import com.zjx.readlife.ireader.model.bean.BookTagBean;

import java.util.List;

/**
 * Created by readlife on 17-5-1.
 */

public class BookTagPackage extends BaseBean {

    private List<BookTagBean> data;

    public List<BookTagBean> getData() {
        return data;
    }

    public void setData(List<BookTagBean> data) {
        this.data = data;
    }


}
