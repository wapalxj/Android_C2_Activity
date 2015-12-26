package com.vero.activity;

import android.app.Application;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

//将此类设置为启动Application
public  class VeroActivity extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println(1234567890 + "vero");
        Log.w("aaa", "qqq");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }



}
