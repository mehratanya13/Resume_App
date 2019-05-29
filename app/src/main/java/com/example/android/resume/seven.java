package com.example.android.resume;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class seven extends Activity {
    Animation alpha,logo,hp,s;
    ObjectAnimator animation6,animation5;
    ImageView fly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seven);
        Log.i("hello ","there");

       fly= (ImageView)findViewById(R.id.fly);
        Log.i("hello ","found");
       animation6 = ObjectAnimator.ofFloat(fly, "translationX", 350f);
        animation6.setDuration(3000);
        animation6.start();
        Log.i("hello ","the");
       animation5 = ObjectAnimator.ofFloat(fly, "translationY", -300f);
        animation5.setDuration(3000);
        animation5.start();

        RelativeLayout a1 = (RelativeLayout) findViewById(R.id.p1);
        RelativeLayout a2 = (RelativeLayout) findViewById(R.id.p2);
        RelativeLayout a3 = (RelativeLayout) findViewById(R.id.p3);
        RelativeLayout a4 = (RelativeLayout) findViewById(R.id.p4);

        alpha=AnimationUtils.loadAnimation(this,R.anim.alpha);

        a1.startAnimation(alpha);
        a2.startAnimation(alpha);
        a3.startAnimation(alpha);
        a4.startAnimation(alpha);


        Button move = (Button) findViewById(R.id.next5);

                animation5.pause();
                animation6.pause();

        move.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (!(animation5.isPaused()&& animation6.isPaused())) {
                    Intent intent = new Intent(seven.this, eight.class);

                    // start the activity connect to the specified class
                    startActivity(intent);

                } else if (animation5.isPaused()&& animation6.isPaused()) {
                    animation5.resume();
                    animation6.resume();
                }
                new CountDownTimer(1500, 1500) {
                    @Override
                    public void onFinish() {
                        animation5.pause();
                        animation6.pause();

                    }

                    @Override
                    public void onTick(long millisUntilFinished) {

                    }
                }.start();
            }
        });
    }
}

