package com.vero.c2_228_configurationchanges;

import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("vero", "onCreate---onCreate---onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i("vero","onConfigurationChanged");
        if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Log.i("vero","-LANDSCAPE!");
        }else {
            Log.i("vero","|PORTRAIT");
        }
    }

}
