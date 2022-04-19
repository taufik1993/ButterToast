package com.taufik.mvvmtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.taufik.buttertoast.ButterToast;

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
        new ButterToast.Builder(this).setMessage("demo").create();
    }
}