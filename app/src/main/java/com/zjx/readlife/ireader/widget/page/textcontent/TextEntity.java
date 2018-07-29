package com.zjx.readlife.ireader.widget.page.textcontent;

/**
 * Created by zhaojianxin on 2018/7/28.
 */

public class TextEntity {
    String textContent;
    TextLocation textLocation;

    public TextEntity(String textContent, TextLocation textLocation) {
        this.textContent = textContent;
        this.textLocation = textLocation;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public TextLocation getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(TextLocation textLocation) {
        this.textLocation = textLocation;
    }
}
