package com.c2_2_23_01_life;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("onCreate-Life","onCreate-Life");
        setContentView(R.layout.activity_life);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart-Life","onStart-Life");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume-Life","onResume-Life");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause-Life","onPause-Life");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop-Life","onStop-Life");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart-Life","onRestart-Life");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy-Life","onDestroy-Life");
    }
}
