package com.c4_a60_intent_permission;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * API---23动态权限获取
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button call;
    private Button call2;
    private Button dial;
    private Button sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){
        dial=(Button)findViewById(R.id.dial);
        call=(Button)findViewById(R.id.call);
        call2=(Button)findViewById(R.id.call2);
        sms=(Button)findViewById(R.id.sms);
        dial.setOnClickListener(this);
        call.setOnClickListener(this);
        call2.setOnClickListener(this);
        sms.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.dial:
                i=new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:18468050252"));
                startActivity(i);
                break;
            case R.id.sms:
                i=new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("smsto:18468050252"));
                i.putExtra("sms_body","发送的内容");
                startActivity(i);
                break;
            case R.id.call:
                //没有用过下面的按钮获取权限的话，崩溃
            callDirectly();
            break;
            case R.id.call2:
                //动态获取权限
                //注意：再这里获取权限之后，再点击上面的call按钮也能正常拨打
                if (Build.VERSION.SDK_INT >= 23) {
                    //检查是否已经申请该权限
                    int checkCallPhonePermission = ContextCompat.checkSelfPermission(
                            this,
                            Manifest.permission.CALL_PHONE);
                    if(checkCallPhonePermission != PackageManager.PERMISSION_GRANTED){
                        //没有申请则进行申请
                        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);

                        return;
                    }else{
                        //拨号方法
                        //注意：每次测试获取权限都应该先卸载APP
                        callDirectly();
                    }

                } else {
                    //拨号方法
                    callDirectly();
                }
                break;

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission Granted
                    callDirectly();
                } else {
                    // Permission Denied
                    Toast.makeText(MainActivity.this, "你拒绝了CALL_PHONE权限申请", Toast.LENGTH_SHORT)
                            .show();

                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    private void callDirectly(){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:18468050252" ));
        startActivity(intent);
    }

}
