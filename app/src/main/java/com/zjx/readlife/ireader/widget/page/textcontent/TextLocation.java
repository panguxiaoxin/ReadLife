package com.zjx.readlife.ireader.widget.page.textcontent;

/**
 * Created by zhaojianxin on 2018/7/28.
 */

public class TextLocation {
    float text_start_x;
    float text_start_y;
    float text_end_x;
    float text_end_y;

    public TextLocation(float text_start_x, float text_start_y, float text_end_x, float text_end_y) {
        this.text_start_x = text_start_x;
        this.text_start_y = text_start_y;
        this.text_end_x = text_end_x;
        this.text_end_y = text_end_y;
    }

    public float getText_start_x() {
        return text_start_x;
    }

    public void setText_start_x(float text_start_x) {
        this.text_start_x = text_start_x;
    }

    public float getText_start_y() {
        return text_start_y;
    }

    public void setText_start_y(float text_start_y) {
        this.text_start_y = text_start_y;
    }

    public float getText_end_x() {
        return text_end_x;
    }

    public void setText_end_x(float text_end_x) {
        this.text_end_x = text_end_x;
    }

    public float getText_end_y() {
        return text_end_y;
    }

    public void setText_end_y(float text_end_y) {
        this.text_end_y = text_end_y;
    }
}
