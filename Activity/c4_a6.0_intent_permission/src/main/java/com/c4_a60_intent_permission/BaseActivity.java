package com.c4_a60_intent_permission;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装Permission
 */
public class BaseActivity extends AppCompatActivity {
    PermissionListener mListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    /**
     *
     * @param permissions：权限数组
     */
    public void reqRP(String[] permissions){
        Activity topActivity=ActivityCollcetor.getTopActivity();
        if(topActivity==null){
            return;
        }
        List<String> perL=new ArrayList<>();
        for (String permission:permissions) {
            int checkCallPhonePermission = ContextCompat.checkSelfPermission(
                    topActivity,
                    Manifest.permission.CALL_PHONE);
            if(checkCallPhonePermission != PackageManager.PERMISSION_GRANTED){
                perL.add(permission);

            }
        }
        if(!perL.isEmpty()){
            ActivityCompat.requestPermissions(topActivity,perL.toArray());
        }else {
            mListener.onGranted();
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case 1:
                if(grantResults.length>0){
                    List<String> deniedPermission=new ArrayList<>();
                    for (int i =0;i<grantResults.length; i++) {
                        int grantResult=grantResults[i];

                    }
                }
                break;
        }
    }
}
