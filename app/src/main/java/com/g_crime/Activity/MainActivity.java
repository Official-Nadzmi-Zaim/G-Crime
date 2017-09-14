package com.g_crime.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.g_crime.Fragment.Category1;
import com.g_crime.Fragment.Category2;
import com.g_crime.Fragment.Category3;
import com.g_crime.Fragment.FrontPage;
import com.g_crime.R;

public class MainActivity extends AppCompatActivity {

    public static int sumCategory1, sumCategory2, sumCategory3;
    //Buat 3 array untuk setiap category, untuk warna button, boleh kira score;
    public static int[] array_1 = new int[19];
    public static int[] array_2 = new int[18];
    public static int[] array_3 = new int[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new FrontPage()).commit();
    }
}
