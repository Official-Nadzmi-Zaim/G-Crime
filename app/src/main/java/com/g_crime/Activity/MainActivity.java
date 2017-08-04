package com.g_crime.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.g_crime.Fragment.Category1;
import com.g_crime.Fragment.Category2;
import com.g_crime.Fragment.Category3;
import com.g_crime.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new Category3()).commit();
    }
}
