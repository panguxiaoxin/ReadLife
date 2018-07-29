package com.zjx.readlife.ireader.widget.page.textcontent;

import java.util.List;

/**
 * Created by zhaojianxin on 2018/7/28.
 */

public class TextParagraph {
    public int para_position;
     public  List<TextLine> lines;
    public  TextLocation paragLocation;

    public TextLocation getParagLocation() {
        return paragLocation;
    }

    public void setParagLocation(TextLocation paragLocation) {
        this.paragLocation = paragLocation;
    }

    public TextParagraph(int para_position, List<TextLine> lines) {
        this.para_position = para_position;
        this.lines = lines;
    }

    public void setPara_position(int para_position) {
        this.para_position = para_position;
    }

    public void setLines(List<TextLine> lines) {
        this.lines = lines;
    }

    public int getPara_position() {
        return para_position;
    }

    public List<TextLine> getLines() {
        return lines;
    }
}
