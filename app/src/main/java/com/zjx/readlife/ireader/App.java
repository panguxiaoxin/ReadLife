package com.zjx.readlife.ireader;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.zjx.readlife.ireader.service.DownloadService;

/**
 * Created by readlife on 17-4-15.
 */

public class App extends Application {
    private static Context sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        startService(new Intent(getContext(), DownloadService.class));
    }

    public static Context getContext(){
        return sInstance;
    }
}