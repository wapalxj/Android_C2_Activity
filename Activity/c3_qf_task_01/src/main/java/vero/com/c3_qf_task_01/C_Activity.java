package vero.com.c3_qf_task_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class C_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_);
    }
    public void showActivities(View view){
        TaskUtils.showTasks(C_Activity.this);
    }
}
