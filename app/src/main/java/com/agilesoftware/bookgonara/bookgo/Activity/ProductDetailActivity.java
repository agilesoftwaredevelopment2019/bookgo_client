package com.agilesoftware.bookgonara.bookgo.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.agilesoftware.bookgonara.bookgo.R;
import com.agilesoftware.bookgonara.bookgo.databinding.ActivityProductDetailBinding;

public class ProductDetailActivity extends AppCompatActivity {

    private ActivityProductDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
