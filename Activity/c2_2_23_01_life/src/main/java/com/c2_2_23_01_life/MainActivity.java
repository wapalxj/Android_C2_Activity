package com.c2_2_23_01_life;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * 启动下一个Activity后finish调自己，查看生命周期
 */
public class MainActivity extends AppCompatActivity {
    Button btn_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("onCreate-Main","onCreate-Main");
        setContentView(R.layout.activity_main);
        btn_start= (Button) findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LifeActivity.class));
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart-Main","onStart-Main");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume-Main","onResume-Main");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause-Main","onPause-Main");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop-Main","onStop-Main");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart-Main","onRestart-Main");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy-Main","onDestroy-Main");
    }

}
