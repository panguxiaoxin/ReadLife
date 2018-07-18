package com.zjx.readlife.ireader;

import com.zjx.readlife.ireader.utils.Constant;
import com.zjx.readlife.ireader.utils.StringUtils;

import org.junit.Test;

/**
 * Created by readlife on 17-4-22.
 */

public class DateConvertTest{

    @Test
    public void testDate(){
        String date = "2017-04-22T13:20:19.700Z";
        String pattern = Constant.FORMAT_BOOK_DATE;
        String value = StringUtils.dateConvert(date,pattern);
        System.out.print(value);
    }
}
