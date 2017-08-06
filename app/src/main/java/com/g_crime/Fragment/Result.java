package com.g_crime.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.g_crime.R;

import static com.g_crime.Activity.MainActivity.sumCategory1;
import static com.g_crime.Activity.MainActivity.sumCategory2;
import static com.g_crime.Activity.MainActivity.sumCategory3;

public class Result extends Fragment implements View.OnClickListener {
    // views
    View v;
    ImageButton ibLaw, ibManagement, ibEnvironment;
    TextView tvScoreLaw, tvScoreManagement, tvScoreEnvironment, tvTotalScore;
    ImageView ivLevel;
    Button btnFrontPage;

    // vars
    int totalScore, level;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_result, container, false);

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
        switch (v.getId()) {
            case R.id.ibLaw:
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new Category1()).commit();
                break;
            case R.id.ibManagement:
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new Category2()).commit();
                break;
            case R.id.ibEnvironment:
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new Category3()).commit();
                break;
            case R.id.btnFrontPage:
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new FrontPage()).commit();
                break;
        }
    }
    // ---------------------------------------------------------------------------------------------

    // process -------------------------------------------------------------------------------------
    private void mainProcess() {
        // calc total score & determine level
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
