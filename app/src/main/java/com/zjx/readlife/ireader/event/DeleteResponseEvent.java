package com.zjx.readlife.ireader.event;

import com.zjx.readlife.ireader.model.bean.CollBookBean;

/**
 * Created by readlife on 17-5-27.
 */

public class DeleteResponseEvent {
    public boolean isDelete;
    public CollBookBean collBook;
    public DeleteResponseEvent(boolean isDelete,CollBookBean collBook){
        this.isDelete = isDelete;
        this.collBook = collBook;
    }
}
