package com.example.skalowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    ImageView zdj;
    SeekBar a,r,g,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zdj = (ImageView) findViewById(R.id.imageView);
        r = (SeekBar) findViewById(R.id.seekBar2);
        g = (SeekBar) findViewById(R.id.seekBar3);
        b = (SeekBar) findViewById(R.id.seekBar4);
        a = (SeekBar) findViewById(R.id.seekBar5);

        int[] colors = {
                0,0,0,0
        };

        a.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                colors[0] = progress;
                zdj.setColorFilter(Color.argb(colors[0],colors[1],colors[2],colors[3]));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        r.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                colors[1] = progress;
                zdj.setColorFilter(Color.argb(colors[0],colors[1],colors[2],colors[3]));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        g.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                colors[2] = progress;
                zdj.setColorFilter(Color.argb(colors[0],colors[1],colors[2],colors[3]));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        b.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                colors[3] = progress;
                zdj.setColorFilter(Color.argb(colors[0],colors[1],colors[2],colors[3]));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void klik(View view) {
        zdj.setImageResource(R.drawable.ponczek);
    }
}