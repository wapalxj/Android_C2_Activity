package com.book.vero.c2_2_21_excise2_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button view;
    private Button call;
    private Button dial;
    private Button sms;
    private Button share;
    private Button start;
    private Button goReader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.dial:
                i=new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:18468050252"));
                startActivity(i);
                break;
            case R.id.call:
                i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:18468050252"));
                startActivity(i);
                break;
            case R.id.sms:
                i=new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("smsto:18468050252"));
                i.putExtra("sms_body","发送的内容");
                startActivity(i);
                break;
            case R.id.share:
                i=new Intent(Intent.ACTION_SEND);
                i.setType("text/*");//necessary
                i.putExtra(Intent.EXTRA_TEXT,"发送的内容");
                startActivity(i);
                break;
            case R.id.goReader:
                i=new Intent(Intent.ACTION_VIEW);
                i.setType("text/*");//necessary
                i.putExtra(Intent.EXTRA_TEXT,"发送的内容");
                startActivity(i);
                break;
            case R.id.startActivity:
                i=new Intent("com.vero.vnix");
                startActivity(i);
                break;


        }
    }
    public void init(){
        view=(Button)findViewById(R.id.view);
        dial=(Button)findViewById(R.id.dial);
        call=(Button)findViewById(R.id.call);
        sms=(Button)findViewById(R.id.sms);
        share=(Button)findViewById(R.id.share);
        start=(Button)findViewById(R.id.startActivity);
        goReader=(Button)findViewById(R.id.goReader);
        view.setOnClickListener(this);
        dial.setOnClickListener(this);
        call.setOnClickListener(this);
        sms.setOnClickListener(this);
        share.setOnClickListener(this);
        start.setOnClickListener(this);
        goReader.setOnClickListener(this);
    }


}
