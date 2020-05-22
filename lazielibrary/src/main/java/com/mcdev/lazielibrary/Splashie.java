package com.mcdev.lazielibrary;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;

public class Splashie {

    /*Inflate a view and finish the view after duration*/
    public static void splash (final Activity activity, Class secondActivity, final long durationInMilliseconds) {
        Window w = activity.getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        final Intent i = new Intent(activity, secondActivity);

        Thread timer = new Thread(){
            public void run (){
                try{
                    sleep(durationInMilliseconds);
                } catch (InterruptedException e) {
                    e.printStackTrace();
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
