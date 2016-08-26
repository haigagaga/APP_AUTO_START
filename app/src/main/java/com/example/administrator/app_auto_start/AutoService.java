package com.example.administrator.app_auto_start;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/8/26.
 */

public class AutoService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        //Service被启动时，将会有弹出消息提示
        Toast.makeText(this, "Service has Started AUTOly", Toast.LENGTH_SHORT).show();
    }
}
