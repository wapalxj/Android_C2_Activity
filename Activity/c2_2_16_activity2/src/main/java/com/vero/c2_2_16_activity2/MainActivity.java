package com.vero.c2_2_16_activity2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        //既然Activity是通过window来视图，那我们就用window:inflate
        this.getWindow().setContentView(this.getLayoutInflater().inflate(R.layout.activity_main, null));
        //动态设置Text
        Button button= (Button) this.findViewById(R.id.button);
        button.setText("new Text!");

        //动态添加一个btn2
        final Button btn2=new Button(this);//this表示这个button和当前类有关
        btn2.setText("btn2");
        LinearLayout l=(LinearLayout)findViewById(R.id.LinearLayout);
        l.addView(btn2);

        //事件：事件主题，发生对象
        //事件的监听函数
        //事件的逻辑代码
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setText("button is onclicked!");
                Toast.makeText(MainActivity.this,"button click", Toast.LENGTH_LONG).show();
            }
        });
    }
}