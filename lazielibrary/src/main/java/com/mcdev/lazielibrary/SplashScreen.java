package com.mcdev.lazielibrary;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen{

    private Activity activity;

    public SplashScreen() {
    }

    public SplashScreen(Activity activity) {
        this.activity = activity;
        activity.setContentView(R.layout.activity_splash);
    }

    public void createSimpleSplashScreen( int drawable) {
        /*Logo image view*/
        ImageView imageView = activity.findViewById(R.id.splash_iv);
        imageView.setImageResource(drawable);
    }

    public void createSimpleSplashScreen( int drawable, @Nullable String title, @Nullable String message) {
        /*Title text view*/
        TextView titleTextView = activity.findViewById(R.id.splash_title_tv);
        titleTextView.setVisibility(View.VISIBLE);
        titleTextView.setText(title);
        titleTextView.setTextColor(Color.parseColor("#FFF4BD08"));

        TextView messageTextView = activity.findViewById(R.id.splash_message_tv);
        messageTextView.setVisibility(View.VISIBLE);
        messageTextView.setText(message);

        /*Logo image view*/
        ImageView imageView = activity.findViewById(R.id.splash_iv);
        imageView.setImageResource(drawable);
    }

    public void createSimpleSplashScreen( int drawable, int title, int message) {

        /*Title text view*/
        TextView titleTextView = activity.findViewById(R.id.splash_title_tv);
        titleTextView.setVisibility(View.VISIBLE);
        titleTextView.setText(title);
        titleTextView.setTextColor(Color.parseColor("#FFF4BD08"));

            TextView messageTextView = activity.findViewById(R.id.splash_message_tv);
            messageTextView.setVisibility(View.VISIBLE);
            messageTextView.setText(message);

        /*Logo image view*/
        ImageView imageView = activity.findViewById(R.id.splash_iv);
        imageView.setImageResource(drawable);

    }


    public void createSimpleSplashScreen(int drawable, int title, String message) {
        /*Title text view*/
        TextView titleTextView = activity.findViewById(R.id.splash_title_tv);
        titleTextView.setVisibility(View.VISIBLE);
        titleTextView.setText(title);
        titleTextView.setTextColor(Color.parseColor("#FFF4BD08"));

        /*message text view*/
        TextView messageTextView = activity.findViewById(R.id.splash_message_tv);
        messageTextView.setVisibility(View.VISIBLE);
        messageTextView.setText(message);

        /*Logo image view*/
        ImageView imageView = activity.findViewById(R.id.splash_iv);
        imageView.setImageResource(drawable);

    }

    public void createSimpleSplashScreen(int drawable, String title, int message) {
        /*Title text view*/
        TextView titleTextView = activity.findViewById(R.id.splash_title_tv);
        titleTextView.setVisibility(View.VISIBLE);
        titleTextView.setText(title);
        titleTextView.setTextColor(Color.parseColor("#FFF4BD08"));

        /*message text view*/
        TextView messageTextView = activity.findViewById(R.id.splash_message_tv);
        messageTextView.setVisibility(View.VISIBLE);
        messageTextView.setText(message);



        /*Logo image view*/
        ImageView imageView = activity.findViewById(R.id.splash_iv);
        imageView.setImageResource(drawable);

    }

    public void setActivityBackgroundColor(int color) {
        RelativeLayout splashRelativeLayout = activity.findViewById(R.id.splash_rel_lay);
        splashRelativeLayout.setBackgroundColor(color);
    }

    public void setActivityBackgroundDrawable(Drawable drawable) {
        RelativeLayout splashRelativeLayout = activity.findViewById(R.id.splash_rel_lay);
        splashRelativeLayout.setBackground(drawable);
    }
}
