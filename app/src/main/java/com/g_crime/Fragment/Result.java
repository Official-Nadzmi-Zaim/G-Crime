package com.g_crime.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g_crime.R;

public class Result extends Fragment {
    // views


    // vars

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_result, container, false);

        initViews();
        initListener();

        return v;
    }

    // initialization ------------------------------------------------------------------------------
    private void initViews() {

    }

    private void initListener() {

    }
    // ---------------------------------------------------------------------------------------------
}
