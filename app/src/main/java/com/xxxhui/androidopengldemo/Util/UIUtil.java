package com.xxxhui.androidopengldemo.Util;

import android.app.Activity;

/**
 * Created by zhangxianghui on 18/3/14.
 */

public class UIUtil {

    public static <T>T findView(Activity activity, int id) {
        return (T) activity.findViewById(id);
    }
}
