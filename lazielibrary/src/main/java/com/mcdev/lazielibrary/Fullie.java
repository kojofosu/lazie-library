package com.mcdev.lazielibrary;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;

public class Fullie {

    public static void makeFullScreen(Activity activity) {
        Window window = activity.getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
    }
}
