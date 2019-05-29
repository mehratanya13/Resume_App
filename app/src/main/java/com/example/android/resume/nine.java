package com.example.android.resume;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class nine extends Activity {
    Animation alpha,logo,hp,s;
    ImageView foot,ball;
    ObjectAnimator animation4,animation5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nine);
        foot= (ImageView)findViewById(R.id.football);
        animation4 = ObjectAnimator.ofFloat(foot, "translationX", 300f);
        animation4.setDuration(4500);
        animation4.start();
        ball= (ImageView)findViewById(R.id.ball);
        animation5 = ObjectAnimator.ofFloat(ball, "translationX", 400f);
        animation5.setDuration(4500);
        animation5.start();



        s=AnimationUtils.loadAnimation(this,R.anim.s);
        Button move = (Button) findViewById(R.id.next5);

                animation4.pause();

        move.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (animation4.isPaused()) {
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


