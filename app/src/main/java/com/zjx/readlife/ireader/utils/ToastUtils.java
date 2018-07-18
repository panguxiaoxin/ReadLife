package com.zjx.readlife.ireader.utils;

import android.widget.Toast;

import com.zjx.readlife.ireader.App;

/**
 * Created by readlife on 17-5-11.
 */

public class ToastUtils {

    public static void show(String msg){
        Toast.makeText(App.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
