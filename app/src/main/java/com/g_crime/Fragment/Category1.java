package com.g_crime.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g_crime.Adapter.SoalanAdapter;
import com.g_crime.R;

public class Category1 extends Fragment {

    private String[] listSoalan1_1 = new String[19];
    private int[] listNoSoalan1_1 = new int[19];

    private RecyclerView rcSoalan1_1;

    public Category1() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category1, container, false);

        rcSoalan1_1 = (RecyclerView) v.findViewById(R.id.rcSoalan1_1);

        //masukkan soalan ke dalam listSoalan
        for (int i=0; i<19; i++){
            String soalanId = "cS" + (i + 1);
            int id = getResources().getIdentifier(soalanId, "string", getActivity().getPackageName());
            listSoalan1_1[i] = getString(id);
            listNoSoalan1_1[i] = (i + 1);
        }

        rcSoalan1_1.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan1_1.setItemAnimator(new DefaultItemAnimator());
        rcSoalan1_1.setAdapter(new SoalanAdapter(listNoSoalan1_1, listSoalan1_1));

        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //Save dalam bundle untuk calculation
    }
}
