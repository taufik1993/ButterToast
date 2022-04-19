package com.taufik.mvvmtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.taufik.buttertoast.ButterToast;
import com.taufik.buttertoast.ButterToast1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnClickToast).setOnClickListener(v -> {
            showToast();
        });
    }

    private void showToast() {
        new ButterToast1.Builder(this).setMessage("demo").create();
    }
}