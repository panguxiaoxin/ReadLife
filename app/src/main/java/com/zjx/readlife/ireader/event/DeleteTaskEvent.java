package com.zjx.readlife.ireader.event;

import com.zjx.readlife.ireader.model.bean.CollBookBean;

/**
 * Created by readlife on 17-5-27.
 */

public class DeleteTaskEvent {
    public CollBookBean collBook;

    public DeleteTaskEvent(CollBookBean collBook){
        this.collBook = collBook;
    }
}
