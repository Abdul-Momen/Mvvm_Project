package com.momen.mvvmproject.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.momen.mvvmproject.R;
import com.momen.mvvmproject.viewmodel.MainAcitivityViewModel;

public class MainActivity extends AppCompatActivity {

    MainAcitivityViewModel mainAcitivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
