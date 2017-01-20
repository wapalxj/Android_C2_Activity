package com.c4_a60_intent_permission;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/27.
 */

public class ActivityCollcetor {
    private static List<Activity> activityList=new ArrayList<>();
    
    public static void addActivity(Activity activity){
        activityList.add(activity);
    }


    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }


    public static Activity getTopActivity(){
        if(activityList.isEmpty()){
            return null;
        }else {
            return activityList.get(activityList.size()-1);
        }
    }
}
