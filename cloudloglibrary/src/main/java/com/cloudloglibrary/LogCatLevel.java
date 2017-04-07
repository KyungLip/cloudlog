package com.cloudloglibrary;


/**
 * Author:LiuPen Created at 2017/4/5 19:39
 * Email:kyunglip1314@163.com
 * Corporation:乐果科技
 * 网址:www.leguosy.com
 * Description:
 */
public interface LogCatLevel {
    int MIN_LEVEL = 0;
    int MAX_lEVEL = 32;
    int LOG_LEVEL_Assert = 32;
    int LOG_LEVEL_Error = 16;
    int LOG_LEVEL_WARN = 8;
    int LOG_LEVEL_INFO = 4;
    int LOG_LEVEL_DEBUG = 2;
    int LOG_LEVEL_VERBOSE = 0;
}
