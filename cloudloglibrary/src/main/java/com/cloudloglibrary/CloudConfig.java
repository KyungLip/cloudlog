package com.cloudloglibrary;

/**
 * Author:LiuPen Created at 2017/4/6 11:39
 * Email:kyunglip1314@163.com
 * Corporation:乐果科技
 * 网址:www.leguosy.com
 * Description:
 */
public class CloudConfig {

    //日志总开关
    protected static boolean IS_DUBUG = true;//用于区分Debug和release模式
    protected static int FILE_LOGCAT_LEVEL = 0;//写入日志级别
    protected static boolean THREADINFO = true;//线程信息
    protected static boolean PACKAGENAME = true;//包名
    protected static boolean METHODNAME = true;//调用方法名
    protected static boolean LINENUMBER = true;//代码行号

    public static boolean isDubug() {
        return IS_DUBUG;
    }

    public static void setIsDubug(boolean isDubug) {
        IS_DUBUG = isDubug;
    }

    public static int getFileLogcatLevel() {
        return FILE_LOGCAT_LEVEL;
    }

    public static void setFileLogcatLevel(int fileLogcatLevel) {
        FILE_LOGCAT_LEVEL = fileLogcatLevel;
    }

    public static boolean isShowThreadInfo() {
        return THREADINFO;
    }

    public static void setIsShowThreadInfo(boolean flag) {
        CloudConfig.THREADINFO = flag;
    }

    public static boolean isShowPackageName() {
        return PACKAGENAME;
    }

    public static void setIsShowPackageName(boolean flag) {
        CloudConfig.PACKAGENAME = flag;
    }

    public static boolean isShowMethodName() {
        return METHODNAME;
    }

    public static void setIsShowMethodName(boolean flag) {
        CloudConfig.METHODNAME = flag;
    }

    public static boolean isShowLineNumber() {
        return LINENUMBER;
    }

    public static void setIsShowLineNumber(boolean flag) {
        CloudConfig.LINENUMBER = flag;
    }
}
