package com.vero.c2_2_21_excise;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=new Intent(MainActivity.this,Activity2.class);
        i.putExtra("vero", "to ac2");
        Button start =new Button(this);
        start.setText("start");
        LinearLayout l=(LinearLayout)findViewById(R.id.LinearLayout);
        l.addView(start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(i);
                startActivityForResult(i, 12);
            }

        });
        Button phone =new Button(this);
        phone.setText("phone");;
        l.addView(phone);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(MainActivity.this, PhoneCall.class);
                startActivity(p);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==123){
            String result=data.getStringExtra("vero");
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        }
    }
}
