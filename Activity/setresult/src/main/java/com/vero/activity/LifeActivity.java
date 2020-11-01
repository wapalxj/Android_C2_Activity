package com.vero.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public abstract class LifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(getTag(),"onCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(getTag(),"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(getTag(),"onResum()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(getTag(),"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(getTag(),"onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(getTag(),"onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(getTag(),"onDestroy()");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(getTag(),"onActivityResult");
    }

    protected abstract String getTag();

}
