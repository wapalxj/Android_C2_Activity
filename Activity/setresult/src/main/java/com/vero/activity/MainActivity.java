package com.vero.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends LifeActivity {
    public static final int OK = 1;
    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv = (TextView) findViewById(R.id.tv);
    }


    public void next(View view) {
        Intent intent = new Intent(this, BActivity.class);
        startActivityForResult(intent, OK);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==OK && resultCode == OK) {
            String result = data.getStringExtra("result");
            if (!TextUtils.isEmpty(result)) {
                mTv.setText(result);
            }
        }
    }

    @Override
    protected String getTag() {
        return "lllll--"+getClass().getSimpleName();
    }
}
