package com.g_crime.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.g_crime.Activity.*;
import com.g_crime.Activity.Analysis;
import com.g_crime.R;


import static com.g_crime.Activity.MainActivity.cat1SecScores;
import static com.g_crime.Activity.MainActivity.cat2SecScores;
import static com.g_crime.Activity.MainActivity.cat3SecScores;
import static com.g_crime.Activity.MainActivity.sumCategory1;
import static com.g_crime.Activity.MainActivity.sumCategory2;
import static com.g_crime.Activity.MainActivity.sumCategory3;

public class Result extends Fragment implements View.OnClickListener {
    // views
    View v;
    ImageButton ibLaw, ibManagement, ibEnvironment;
    TextView tvScoreLaw, tvScoreManagement, tvScoreEnvironment, tvTotalScore;
    ImageView ivLevel, ivLevelLaw, ivLevelManagement, ivLevelEnvironment;
    Button btnFrontPage;

    // vars
    int totalScore, level;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_result, container, false);

        //clear backstack fragment if exist leaving the front page only
        for (int i=1; i<getActivity().getSupportFragmentManager().getBackStackEntryCount(); i++){
            getActivity().getSupportFragmentManager().popBackStack();
        }

        initViews();
        initListener();
        mainProcess();

        return v;
    }

    // initialization ------------------------------------------------------------------------------
    private void initViews() {
        ibLaw = (ImageButton) v.findViewById(R.id.ibLaw);
        ibManagement = (ImageButton) v.findViewById(R.id.ibManagement);
        ibEnvironment = (ImageButton) v.findViewById(R.id.ibEnvironment);
        tvScoreLaw = (TextView) v.findViewById(R.id.tvScoreLaw);
        tvScoreManagement = (TextView) v.findViewById(R.id.tvScoreManagement);
        tvScoreEnvironment = (TextView) v.findViewById(R.id.tvScoreEnvironment);
        tvTotalScore = (TextView) v.findViewById(R.id.tvTotalScore);
        ivLevel = (ImageView) v.findViewById(R.id.ivLevel);
        btnFrontPage = (Button) v.findViewById(R.id.btnFrontPage);
        ivLevelLaw = (ImageView) v.findViewById(R.id.ivLevelLaw);
        ivLevelManagement = (ImageView) v.findViewById(R.id.ivLevelManagement);
        ivLevelEnvironment = (ImageView) v.findViewById(R.id.ivLevelEnvironment);
    }

    private void initListener() {
        ibLaw.setOnClickListener(this);
        ibManagement.setOnClickListener(this);
        ibEnvironment.setOnClickListener(this);
        btnFrontPage.setOnClickListener(this);
    }
    // ---------------------------------------------------------------------------------------------

    // listener ------------------------------------------------------------------------------------
    @Override
    public void onClick(View v) {
        Bundle a = this.getArguments();
        Bundle b = new Bundle();

        if (a == null)
            Log.d("Bundle", "Null");
        else {
            b.putIntArray("listColor1_1", a.getIntArray("listColor1_1"));

            b.putIntArray("listColor2_1", a.getIntArray("listColor2_1"));
            b.putIntArray("listColor2_2", a.getIntArray("listColor2_2"));
            b.putIntArray("listColor2_3", a.getIntArray("listColor2_3"));
            b.putIntArray("listColor2_4", a.getIntArray("listColor2_4"));
            b.putIntArray("listColor2_5", a.getIntArray("listColor2_5"));
            b.putIntArray("listColor2_6", a.getIntArray("listColor2_6"));
            b.putIntArray("listColor2_7", a.getIntArray("listColor2_7"));
            b.putIntArray("listColor2_8", a.getIntArray("listColor2_8"));
            b.putIntArray("listColor2_9", a.getIntArray("listColor2_9"));

            b.putIntArray("listColor3_1", a.getIntArray("listColor3_1"));
            b.putIntArray("listColor3_2", a.getIntArray("listColor3_2"));
            b.putIntArray("listColor3_3", a.getIntArray("listColor3_3"));
            b.putIntArray("listColor3_4", a.getIntArray("listColor3_4"));
        }

        switch (v.getId()) {
            case R.id.ibLaw:
                Category1 c1 = new Category1();
                c1.setArguments(b);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, c1).addToBackStack(null).commit();
                break;
            case R.id.ibManagement:
                Category2 c2 = new Category2();
                c2.setArguments(b);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, c2).addToBackStack(null).commit();
                break;
            case R.id.ibEnvironment:
                Category3 c3 = new Category3();
                c3.setArguments(b);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, c3).addToBackStack(null).commit();
                break;
            case R.id.btnFrontPage:
                // hantar data category dkt sini through bundle
                int[] dataCat1, dataCat2, dataCat3;

                // sample data
                dataCat1 = cat1SecScores; // array of section in each category
                dataCat2 = cat2SecScores;
                dataCat3 = cat3SecScores;

                startActivity(new Intent(getActivity(), Analysis.class)
                        .putExtra("dataCat1", dataCat1)
                        .putExtra("dataCat2", dataCat2)
                        .putExtra("dataCat3", dataCat3)
                );
                break;
        }
    }
    // ---------------------------------------------------------------------------------------------

    // process -------------------------------------------------------------------------------------
    private void mainProcess() {
        // calc total score & determine level
        // value retrieved by each function after calculate
        totalScore = sumCategory1 + sumCategory2 + sumCategory3;

        if(totalScore == 0)
            level = Color.GREEN; // green
        else if(totalScore >= 1 && totalScore <= 449)
            level = Color.YELLOW; // yellow
        else if(totalScore >= 450 && totalScore <= 899)
            level = Color.parseColor("#FFAA2A"); // orange
        else
            level = Color.RED; // red


        // get & show score
        tvScoreLaw.setText(String.valueOf(sumCategory1));
        tvScoreManagement.setText(String.valueOf(sumCategory2));
        tvScoreEnvironment.setText(String.valueOf(sumCategory3));
        tvTotalScore.setText(String.valueOf(totalScore));

        // show level
        ivLevel.setBackgroundColor(level);
    }
    // ---------------------------------------------------------------------------------------------
}
