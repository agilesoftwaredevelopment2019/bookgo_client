package com.agilesoftware.bookgonara.bookgo.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.agilesoftware.bookgonara.bookgo.R;
import com.agilesoftware.bookgonara.bookgo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
