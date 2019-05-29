package com.example.android.resume;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class five extends Activity {
    Animation alpha,logo,hp,s;
    ObjectAnimator animation4;

    ImageView car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.five);

       car = (ImageView) findViewById(R.id.car);
       animation4 = ObjectAnimator.ofFloat(car, "translationX", 510f);
        animation4.setDuration(4500);
        animation4.start();
        RelativeLayout b1 = (RelativeLayout) findViewById(R.id.b1);
        ObjectAnimator animation5 = ObjectAnimator.ofFloat(b1, "translationY", 650f);
        animation5.setDuration(5000);
        animation5.start();
        RelativeLayout b2 = (RelativeLayout) findViewById(R.id.b2);
        ObjectAnimator animation6 = ObjectAnimator.ofFloat(b2, "translationY", 200f);
        animation6.setDuration(5000);
        animation6.start();
        RelativeLayout b3 = (RelativeLayout) findViewById(R.id.b3);
        ObjectAnimator animation7 = ObjectAnimator.ofFloat(b3, "translationY", 320f);
        animation7.setDuration(5000);
        animation7.start();
        RelativeLayout b4 = (RelativeLayout) findViewById(R.id.b4);
        ObjectAnimator animation8 = ObjectAnimator.ofFloat(b4, "translationY", 400f);
        animation8.setDuration(5000);
        animation8.start();
        RelativeLayout b5 = (RelativeLayout) findViewById(R.id.b5);
        ObjectAnimator animation9 = ObjectAnimator.ofFloat(b5, "translationY", 200f);
        animation9.setDuration(5000);
        animation9.start();
        s=AnimationUtils.loadAnimation(this,R.anim.s);
        Button move= (Button) findViewById(R.id.next3);
                animation4.pause();
        move.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (!(animation4.isPaused())) {
                    Intent intent = new Intent(five.this, six.class);

                    // start the activity connect to the specified class
                    startActivity(intent);

                } else if (animation4.isPaused()) {
                    animation4.resume();
                }
                new CountDownTimer(1500, 1500) {
                    @Override
                    public void onFinish() {
                        animation4.pause();

                    }

                    @Override
                    public void onTick(long millisUntilFinished) {

                    }
                }.start();
            }
        });
    }
}