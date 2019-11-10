package com.faramarz.tictacdev.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.faramarz.tictacdev.recyclerview.horizontal_recycler.HorizontalActivity;
import com.faramarz.tictacdev.recyclerview.image_recycler.ImageRecycler;
import com.faramarz.tictacdev.recyclerview.simple_recycler.SimpleRecycler;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSimple, btnWithImage, btnHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind();
        clickEvents();
    }


    private void bind() {
        btnSimple = findViewById(R.id.btnSimple);
        btnWithImage = findViewById(R.id.btnWithImage);
        btnHorizontal = findViewById(R.id.btnHorizontal);

    }

    private void clickEvents() {
        btnSimple.setOnClickListener(this);
        btnWithImage.setOnClickListener(this);
        btnHorizontal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btnSimple:
                startActivity(new Intent(MainActivity.this, SimpleRecycler.class));
                break;
            case R.id.btnWithImage:
                startActivity(new Intent(MainActivity.this, ImageRecycler.class));
                break;
            case R.id.btnHorizontal:
                startActivity(new Intent(MainActivity.this, HorizontalActivity.class));
                break;
        }
    }

}
