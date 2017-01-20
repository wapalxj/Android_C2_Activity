package com.vero.c2_2_21_excise;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class PhoneCall extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phon_call);
//        Intent intent=new Intent();
//        intent.setAction(Intent.ACTION_DIAL);//閿熸枻鎷烽敓琛楄鎷烽敓鑴氭枻鎷烽敓鏂ゆ嫹
//        intent.setAction(Intent.ACTION_CALL);//閿熸枻鎷烽敓鏂ゆ嫹缂佸府鎷烽敓鏂ゆ嫹閿熸彮顏庢嫹閿熺祫anifest閿熸枻鎷锋敞閿熸枻鎷�<uses-permission  android:name="android.permission.CALL_PHONE" />
//        intent.setData(Uri.parse(("tel:18468050252")));//閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷风紒甯嫹閿熸枻鎷烽敓缁炶功顒婃嫹閿熻娇顏庢嫹璇寸紒锟�,//閿熷壙杈炬嫹閿熸枻鎷穌ata涓篿ntent-filter閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷穌ata


//        intent.setAction(Intent.ACTION_SENDTO);//閿熸枻鎷烽敓鏂ゆ嫹閿熻剼鏂ゆ嫹閿熸枻鎷�
//        intent.setData(Uri.parse(("smsto:18468050252")));;//閿熸枻鎷烽敓鏂ゆ嫹閿熻剼闈╂嫹
        Uri uri=Uri.parse("tel:18468050252");//閿熸枻鎷烽敓琛楄鎷烽敓鑴氭枻鎷烽敓鑺ワ細閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷锋晥閿熸枻鎷蜂竴閿熸枻鎷�
        Intent intent=new Intent(Intent.ACTION_DIAL,uri);


        startActivity(intent);
    }

}
