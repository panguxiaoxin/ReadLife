package com.zjx.readlife.ireader.widget.page.textcontent;

import java.util.List;

/**
 * Created by zhaojianxin on 2018/7/28.
 */

public class TextPage {
    TextLocation pageLocation; //位置信息
    int position;
    TextParagraph titleLines;// 标题

    List<TextParagraph> contentParas; // 内容

    public TextLocation getPageLocation() {
        return pageLocation;
    }

    public void setPageLocation(TextLocation pageLocation) {
        this.pageLocation = pageLocation;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public TextParagraph getTitleLines() {
        return titleLines;
    }

    public void setTitleLines(TextParagraph titleLines) {
        this.titleLines = titleLines;
    }

    public List<TextParagraph> getContentParas() {
        return contentParas;
    }

    public void setContentParas(List<TextParagraph> contentParas) {
        this.contentParas = contentParas;
    }
}
