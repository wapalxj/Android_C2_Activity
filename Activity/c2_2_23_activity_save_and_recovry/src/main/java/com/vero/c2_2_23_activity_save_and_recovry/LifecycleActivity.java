package com.vero.c2_2_23_activity_save_and_recovry;

import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class LifecycleActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.i("vero log", "Life-onCreate");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("vero log", "Life-onStart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("vero log", "Life-onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("vero log", "Life-onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("vero log", "Life-onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("vero log", "Life-onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("vero log", "Life-onRestart");
    }


}
