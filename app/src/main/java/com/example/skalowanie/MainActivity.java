package com.example.skalowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView zdj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zdj = (ImageView) findViewById(R.id.imageView);
    }

    public void klik(View view) {
        ImageView zdj = new ImageView(this);
        zdj.setImageResource(R.drawable.ponczek);
    }
}