package vero.com.c3_qf_task_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class B_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_);
    }
    public void jeepC(View view){
        Intent toC=new Intent(B_Activity.this,C_Activity.class);
        startActivity(toC);
    }
    public void showActivities(View view){
        TaskUtils.showTasks(B_Activity.this);
    }
}
