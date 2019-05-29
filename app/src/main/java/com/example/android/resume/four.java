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

public class four extends Activity {
    Animation alpha,logo,hp,s;
    ObjectAnimator animation4;
    ImageView cycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);
       cycle = (ImageView) findViewById(R.id.cycle);
        animation4 = ObjectAnimator.ofFloat(cycle, "translationX", 400f);
        animation4.setDuration(4500);
        animation4.start();
        ImageView my = (ImageView) findViewById(R.id.my);
        ObjectAnimator animation5 = ObjectAnimator.ofFloat(my, "translationX", -500f);
        animation5.setDuration(5000);
        animation5.start();
        RelativeLayout result2 = (RelativeLayout) findViewById(R.id.result2);
        Button move = (Button) findViewById(R.id.next3);

        logo=AnimationUtils.loadAnimation(this,R.anim.logo);
        result2.startAnimation(logo);

                animation4.pause();
        move.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (!(animation4.isPaused())) {
                    Intent intent = new Intent(four.this, five.class);

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