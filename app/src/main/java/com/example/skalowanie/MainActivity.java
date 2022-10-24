package com.example.skalowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    ImageView zdj;
    SeekBar r,g,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zdj = (ImageView) findViewById(R.id.imageView);
        r = (SeekBar) findViewById(R.id.seekBar2);
        g = (SeekBar) findViewById(R.id.seekBar3);
        b = (SeekBar) findViewById(R.id.seekBar4);
    }
    public void klik(View view) {
        zdj.setImageResource(R.drawable.ponczek);
    }
}