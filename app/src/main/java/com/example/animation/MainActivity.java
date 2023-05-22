package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button btn_blink,btn_feed,btn_move,btn_rotate,btn_slide,btn_zoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btn_blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation
                        (getApplicationContext(),R.anim.blink_animation);
               imageView.setAnimation(animation);
            }
        });
        btn_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation
                        (getApplicationContext(),R.anim.feed_animation);
                imageView.setAnimation(animation);
            }
        });
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation
                        (getApplicationContext(),R.anim.move_animation);
                imageView.setAnimation(animation);
            }
        });
        btn_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation
                        (getApplicationContext(),R.anim.rotete_animation);
                imageView.setAnimation(animation);
            }
        });
        btn_slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation
                        (getApplicationContext(),R.anim.slide_animation);
                imageView.setAnimation(animation);
            }
        });
        btn_zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation
                        (getApplicationContext(),R.anim.zoom_animation);
                imageView.setAnimation(animation);
            }
        });
    }
    public void init(){
        imageView=findViewById(R.id.img);
        btn_blink=findViewById(R.id.blink);
        btn_feed=findViewById(R.id.feed);
        btn_move=findViewById(R.id.move);
        btn_rotate=findViewById(R.id.rotate);
        btn_slide=findViewById(R.id.slide);
        btn_zoom=findViewById(R.id.zoom);

    }
}