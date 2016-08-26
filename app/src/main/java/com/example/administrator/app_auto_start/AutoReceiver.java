package com.example.administrator.app_auto_start;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2016/8/26.
 */

public class AutoReceiver extends BroadcastReceiver {

    //系统启动完成
    static final String ACTION = "android.intent.action.BOOT_COMPLETED";

    @Override
    public void onReceive(Context context, Intent intent) {
        //当间听到的事件是“BOOT_COMPLETED”时，就创建并启动相应的Activity和Service
        if (intent.getAction().equals(ACTION)) {
            //开机启动的Activity
            Intent activityIntent = new Intent(context, MainActivity.class);
            activityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            //启动Activity
            context.startActivity(activityIntent);

            //开机启动的Service
            Intent serviceIntent = new Intent(context, AutoService.class);
            //启动Service
            context.startService(serviceIntent);

        }
    }
}
