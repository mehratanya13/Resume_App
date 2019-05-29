package com.example.android.resume;

import android.animation.Animator;
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

public class six extends Activity {
    Animation alpha,logo,hp,s;
    ImageView happy;
    ObjectAnimator animation4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.six);

        happy= (ImageView) findViewById(R.id.happy);
        animation4 = ObjectAnimator.ofFloat(happy, "translationX", 400f);
        animation4.setDuration(4500);
        animation4.start();

        ImageView trophy= (ImageView) findViewById(R.id.trophy);
        ObjectAnimator animation5 = ObjectAnimator.ofFloat(trophy, "translationY", -300f);
        animation5.setDuration(4000);
        animation5.start();

        RelativeLayout a1 = (RelativeLayout) findViewById(R.id.a1);
        RelativeLayout a2 = (RelativeLayout) findViewById(R.id.a2);
        RelativeLayout a3 = (RelativeLayout) findViewById(R.id.a3);
        RelativeLayout a4 = (RelativeLayout) findViewById(R.id.a4);
        RelativeLayout a5 = (RelativeLayout) findViewById(R.id.a5);

        alpha=AnimationUtils.loadAnimation(this,R.anim.alpha);

        a1.startAnimation(alpha);
        a2.startAnimation(alpha);
        a3.startAnimation(alpha);
        a4.startAnimation(alpha);
        a5.startAnimation(alpha);


        Button move = (Button) findViewById(R.id.next4);
                animation4.pause();
        move.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (!(animation4.isPaused())) {
                    Intent intent = new Intent(six.this, seven.class);

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