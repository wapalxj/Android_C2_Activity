package com.vero.c2_2_29_androidtaskstack;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

//case AB
public class Activity_A extends ActionBarActivity {
    private static  int index=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSA=(Button)findViewById(R.id.btnSA);
        btnSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sa = new Intent(Activity_A.this, Activity_A.class);
                startActivity(sa);
            }
        });
        Button btnSB=(Button)findViewById(R.id.btnSB);
        btnSB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sb=new Intent(Activity_A.this,Activity_B.class);
                startActivity(sb);
            }
        });
        Log.i("task", "A+"+index+"+task=" + getTaskId());
        index++;
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
