package com.mcdev.lazielibrary;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import java.util.Objects;

public class Splashie {

    /*Inflate a view and finish the view after duration*/
    public static void splash(final Activity activity, Class targetActivity, final int durationInSeconds) {
        Window w = activity.getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        final long durationInMilliseconds = durationInSeconds * 1000;       //converting second to milliseconds
        final Intent i = new Intent(activity, targetActivity);

        Thread timer = new Thread(){
            public void run (){
                try{
                    sleep(durationInMilliseconds);
                } catch (final InterruptedException e) {
                    Log.e(e.getMessage(), Objects.requireNonNull(e.getMessage()));
                    Thread.currentThread().interrupt();
                }
                finally {
                    activity.startActivity(i);
                    activity.finish();
                }
            }
        };
        timer.start();
    }
}
