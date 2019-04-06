package com.r.uselottie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {


    LottieAnimationView animation_view,animation_view_jerking,animation_view_wheel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /** Shihab Uddin */
        // TODO: 4/6/2019 For androidX you need to update lottie library at least 2.8.0 & Up
        animation_view = findViewById(R.id.animation_view);
        animation_view_jerking = findViewById(R.id.animation_view_jerking);
        animation_view_wheel = findViewById(R.id.animation_view_wheel);


        animation_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animation_view.playAnimation();
            }
        });


        animation_view_jerking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation_view_jerking.playAnimation();
            }
        });


        animation_view_wheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation_view_wheel.playAnimation();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
