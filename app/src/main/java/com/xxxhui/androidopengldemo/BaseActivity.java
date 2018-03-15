package com.xxxhui.androidopengldemo;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by zhangxianghui on 18/3/14.
 */

public class BaseActivity extends AppCompatActivity {
    public <T> T findView(int id) {
        return (T) findViewById(id);
    }
}
