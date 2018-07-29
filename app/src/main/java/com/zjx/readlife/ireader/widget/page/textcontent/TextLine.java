package com.zjx.readlife.ireader.widget.page.textcontent;

import java.util.List;

/**
 * Created by zhaojianxin on 2018/7/28.
 */

public class TextLine {
    public int line_position;
   public List<TextEntity> words;
   public TextLocation lineLocaion;

    public TextLocation getLineLocaion() {
        return lineLocaion;
    }

    public void setLineLocaion(TextLocation lineLocaion) {
        this.lineLocaion = lineLocaion;
    }

    public TextLine(int line_position, List<TextEntity> words) {
        this.line_position = line_position;
        this.words = words;
    }

    public int getLine_position() {
        return line_position;
    }

    public void setLine_position(int line_position) {
        this.line_position = line_position;
    }

    public List<TextEntity> getWords() {
        return words;
    }

    public void setWords(List<TextEntity> words) {
        this.words = words;
    }
}
