package com.zjx.readlife.ireader.event;

import com.zjx.readlife.ireader.model.flag.BookDistillate;
import com.zjx.readlife.ireader.model.flag.BookSort;
import com.zjx.readlife.ireader.model.flag.BookType;

/**
 * Created by readlife on 17-4-21.
 */

public class SelectorEvent {

    public BookDistillate distillate;

    public BookType type;

    public BookSort sort;

    public SelectorEvent(BookDistillate distillate,
                         BookType type,
                         BookSort sort) {
        this.distillate = distillate;
        this.type = type;
        this.sort = sort;
    }
}
