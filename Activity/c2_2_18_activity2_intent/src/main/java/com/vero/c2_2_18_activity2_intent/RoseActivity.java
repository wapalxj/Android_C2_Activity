package com.vero.c2_2_18_activity2_intent;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class RoseActivity extends ActionBarActivity {
    Intent mIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rose);
        mIntent=this.getIntent();
        String value;
        if (null!=mIntent){
            value=  mIntent.getExtras().getString("com.vnix");//接收值
//            Toast.makeText(this,value,Toast.LENGTH_SHORT).show();//显示接收值
            Toast.makeText(this,mIntent.getDataString(),Toast.LENGTH_SHORT).show();//显示接收的setData的data
        }
        //返回值
        Button btnR= (Button) findViewById(R.id.btnRose);
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIntent.putExtra("com.vnix","back data");
                setResult(4321, mIntent);
                finish();
            }
        });
    }

}
