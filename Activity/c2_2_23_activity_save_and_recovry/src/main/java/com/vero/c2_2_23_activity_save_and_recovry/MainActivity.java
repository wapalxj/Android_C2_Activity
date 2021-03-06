package com.vero.c2_2_23_activity_save_and_recovry;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//lifeCycyle
public class MainActivity extends ActionBarActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState!=null){
            editText=(EditText)findViewById(R.id.editText);
            editText.setText(savedInstanceState.getString("editTextString"));
            Toast.makeText(MainActivity.this, "onCreate中恢复数据："+savedInstanceState.getString("editTextString"),Toast.LENGTH_SHORT).show();
        }
        Log.i("vero log", "Main onCreate");
        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(MainActivity.this, LifecycleActivity.class);
                startActivity(start);

            }
        });

        //dialog
        Button buttonPart=(Button)findViewById(R.id.btnPart);
        buttonPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final CharSequence[] colors_array = {"red", "blue", "green"};
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("pick_color")
                        .setItems(colors_array, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), colors_array[which], Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);//先屏蔽掉系统的保存，防止我们自己的
        //保存(EditText的内容
        editText=(EditText)findViewById(R.id.editText);
        outState.putString("editTextString", "vnix:"+editText.getText().toString());
        Log.i("vero log", "Main-onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("vero log", "Main-onRestoreInstanceState");
        Toast.makeText(MainActivity.this, "Restore中恢复数据："+savedInstanceState.getString("editTextString"),Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("vero log", "Main-onStart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("vero log", "Main-onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("vero log", "Main-onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("vero log", "Main-onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("vero log", "Main-onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("vero log", "Main-onRestart");
    }

}
