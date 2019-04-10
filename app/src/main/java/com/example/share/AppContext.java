package com.example.share;

import android.app.Application;
import android.content.Context;

import com.mob.MobSDK;

/**
 * Created by Administrator on 2019/4/10 0010
 * <p>
 * Desc:
 */
public class AppContext extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        MobSDK.init(this);
    }
    public static Context getContext()
    {
        return context;
    }

}
