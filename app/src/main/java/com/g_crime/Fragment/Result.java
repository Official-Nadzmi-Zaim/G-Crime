package com.g_crime.Fragment;

import android.os.Bundle;
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

public class Result extends Fragment implements View.OnClickListener {
    // views
    View v;
    ImageButton ibLaw, ibManagement, ibEnvironment;
    TextView tvScoreLaw, tvScoreManagement, tvScoreEnvironment, tvTotalScore;
    ImageView ivLevel;
    Button btnFrontPage;

    // vars
    int scoreLaw, scoreManagement, scoreEnvironment, totalScore;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_result, container, false);

        initViews();
        initListener();

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
                break;
            case R.id.ibManagement:
                break;
            case R.id.ibEnvironment:
                break;
            case R.id.btnFrontPage:
                break;
        }
    }
    // ---------------------------------------------------------------------------------------------
}
