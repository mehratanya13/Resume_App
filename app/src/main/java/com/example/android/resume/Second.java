package com.example.android.resume;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Second extends Activity {
    Animation alpha,logo,hp,s;
    ImageView ch,ch2;
    int maxX;
    ObjectAnimator  animation,animation3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        ch = (ImageView) findViewById(R.id.image);

        ch2 = (ImageView) findViewById(R.id.image2);

        final ObjectAnimator animation = ObjectAnimator.ofFloat(ch, "translationY", 800f);
        animation.setDuration(6000);
        animation.start();
        new CountDownTimer(6000,1000)
        {
            @Override
            public void onFinish() {
                ch.setVisibility(View.INVISIBLE);
                ch2.setVisibility(View.VISIBLE);

            }

            @Override
            public void onTick(long millisUntilFinished) {

            }
        }.start();


        ImageView bird = (ImageView) findViewById(R.id.bird);
        final ObjectAnimator animation2 = ObjectAnimator.ofFloat(bird, "translationX", -500f);
        animation2.setDuration(7000);
        animation2.start();

        TextView name = (TextView) findViewById(R.id.name);
        TextView city = (TextView) findViewById(R.id.city);
        TextView email = (TextView) findViewById(R.id.email);
        Button move = (Button) findViewById(R.id.move);

        alpha=AnimationUtils.loadAnimation(this,R.anim.alpha);
        logo=AnimationUtils.loadAnimation(this,R.anim.logo);
        hp=AnimationUtils.loadAnimation(this,R.anim.hp);
        s=AnimationUtils.loadAnimation(this,R.anim.s);

        name.startAnimation(alpha);
        city.startAnimation(logo);
        email.startAnimation(hp);

        animation3 = ObjectAnimator.ofFloat(ch2, "translationX", 400f);
        animation3.setDuration(4500);
      animation3.start();
      animation3.pause();
        move.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                     if(!(animation3.isPaused()))
                {      Intent intent = new Intent(Second.this, third.class);

                    // start the activity connect to the specified class
                    startActivity(intent);

                }
                   else if(animation3.isPaused()) {
                        animation3.resume();
                    }
                new CountDownTimer(1500,1500)
                {
                    @Override
                    public void onFinish() {
                       animation3.pause();

                    }

                    @Override
                    public void onTick(long millisUntilFinished) {

                    }
                }.start();



            }
        });
    }
}

