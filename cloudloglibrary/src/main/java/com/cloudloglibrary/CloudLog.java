package com.cloudloglibrary;

import android.util.Log;

/**
 * Author:LiuPen Created at 2017/4/5 19:39
 * Email:kyunglip1314@163.com
 * Corporation:乐果科技
 * 网址:www.leguosy.com
 * Description:
 */
public class CloudLog {
    private static final String TAG = "CloudLog";


    public static void d(String tag, String msg) {
        if (CloudConfig.IS_DUBUG) {
            tag = attachCaller() + tag;
            Log.d(TAG, tag + ":" + msg);
        }
    }

    public static void i(String tag, String msg) {
        if (CloudConfig.IS_DUBUG) {
            tag = attachCaller() + tag;
            Log.i(TAG, tag + ":" + msg);
        }
    }

    public static void w(String tag, String msg) {
        if (CloudConfig.IS_DUBUG) {
            tag = attachCaller() + tag;
            Log.w(TAG, tag + ":" + msg);
        }
    }

    public static void e(String tag, String msg) {
        if (CloudConfig.IS_DUBUG) {
            tag = attachCaller() + tag;
            Log.e(TAG, tag + ":" + msg);
        }
    }

    private static String attachCaller() {
        if (CloudConfig.isShowThreadInfo()) {
            return Thread.currentThread().getName() + (CloudConfig.isShowPackageName() ? "[" + new Throwable().getStackTrace()[2] + "]" : "");
        }
        return "";
    }
}
