package com.example.android.resume;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
        private static int splash_time_out=3000;
        Animation alpha;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            alpha=AnimationUtils.loadAnimation(this,R.anim.alpha);
            ImageView imageView=(ImageView)findViewById(R.id.image) ;
            TextView one = (TextView) findViewById(R.id.textView);
            TextView two = (TextView) findViewById(R.id.textView2);
            TextView  three = (TextView) findViewById(R.id.textView3);
            imageView.startAnimation(alpha);
            one.startAnimation(alpha);
            two.startAnimation(alpha);
            three.startAnimation(alpha);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent homeintent=new Intent(MainActivity.this,Second.class);
                    startActivity(homeintent);
                    finish();
                }
            },splash_time_out);
        }
    }
