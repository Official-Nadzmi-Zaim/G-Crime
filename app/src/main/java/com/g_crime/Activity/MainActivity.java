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

    // score for each section in each category
    public static int[] cat1SecScores = new int[7]; // category 1 section score
    public static int[] cat2SecScores = new int[9]; // category 2 section score
    public static int[] cat3SecScores = new int[4]; // category 3 section score

    //Buat 3 array untuk setiap category, untuk warna button, boleh kira score;
    public static int[] array_1 = new int[19];
    public static int[] array_2 = new int[18];
    public static int[] array_3 = new int[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumCategory1 = 0;
        sumCategory2 = 0;
        sumCategory3 = 0;

        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new FrontPage()).commit();
    }
}
