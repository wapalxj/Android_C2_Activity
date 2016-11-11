package vero.com.c3_qf_task_02;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by vero on 2016/6/3.
 */
public class TaskUtils {
    public static void showTasks(Context context){
        ActivityManager am= (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> runningTaskInfos=am.getRunningTasks(10);

        for (ActivityManager.RunningTaskInfo info:runningTaskInfos){
            Log.i("info","id-->"+info.id+",nums-->"+info.numActivities+",base-->"+info.baseActivity.getClassName()+",top-->"+info.topActivity.getClassName());
        }
    }
}
