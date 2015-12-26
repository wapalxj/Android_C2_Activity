package com.vero.c2_2_18_activity2_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent=new Intent(MainActivity.this,RoseActivity.class);
        Intent intent=new Intent();
        intent.putExtra("com.vnix", "Jack and Rose");

        intent.setAction("vnix.demo.activity.VERO");//通过自定义action找到Rose,需要在Manifest中定义
        intent.setData(Uri.parse("http://www.baidu.com"));//传data，需要在Manifest中定义.//此处的data为intent-filter的属性data

        //启动打电话拨号界面
//        intent.setAction(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse(("tel:18468050252")));//启动打电话界面时默认为此电话,//此处的data为intent-filter的属性data
//        startActivity(intent);
        startActivityForResult(intent, 1234);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {//接收返回值
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 4321) {
            String result=data.getExtras().getString("com.vnix");
            Toast.makeText(this,result,Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
