package vero.com.c3_qf_task_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jeepA(View view){
        Intent toA=new Intent(MainActivity.this,A_Activity.class);
        startActivity(toA);
    }
    public void showActivities(View view){
        TaskUtils.showTasks(MainActivity.this);
    }
}
