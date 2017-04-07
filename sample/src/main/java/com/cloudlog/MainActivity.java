package com.cloudlog;

import android.app.Activity;
import android.os.Bundle;

import com.cloudloglibrary.CloudLog;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l();
    }
    private void l(){
        CloudLog.e("你好", "haha");
    }
}
