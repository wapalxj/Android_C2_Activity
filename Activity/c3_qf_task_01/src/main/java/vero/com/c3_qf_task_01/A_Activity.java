package vero.com.c3_qf_task_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class A_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_);
    }
    public void jeepB(View view){
        Intent toB=new Intent(A_Activity.this,B_Activity.class);
        startActivity(toB);
    }
    public void showActivities(View view){
        TaskUtils.showTasks(A_Activity.this);
    }
}
