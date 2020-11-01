package com.vero.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class BActivity extends LifeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void finish(View view) {
        Intent intent = getIntent();
        intent.putExtra("result", "okkkkkkkkkkkkkk"+ new Random().nextInt(9999));
        setResult(MainActivity.OK, intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = getIntent();
        intent.putExtra("result", "okkkkkkkkkkkkkk"+ new Random().nextInt(9999));
        setResult(MainActivity.OK, intent);
        super.onBackPressed();
    }

    @Override
    protected String getTag() {
        return "lllll--"+getClass().getSimpleName();
    }
}
