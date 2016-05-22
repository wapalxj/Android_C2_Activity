package com.book.vero.c2_2_21_excise2_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Reader extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
        tv=(TextView)findViewById(R.id.tv);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent i=getIntent();
        String con=i.getStringExtra(Intent.EXTRA_TEXT);
        if (con!=null){
            tv.setText(con);
        }

    }
}
