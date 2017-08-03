package com.g_crime.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.g_crime.Adapter.SoalanListviewAdapter;
import com.g_crime.R;

public class Category1 extends Fragment {

    @SuppressLint("StaticFieldLeak")
    public static ListView lvCategory1;
    private String[] listSoalan = new String[19];;

    public Category1() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category1, container, false);

        lvCategory1 = (ListView)v.findViewById(R.id.lvCategory1);

        //masukkan soalan ke dalam listSoalan
        for (int i=0; i<19; i++){
            String soalanId = "cS" + (i + 1);
            int id = getResources().getIdentifier(soalanId, "string", getActivity().getPackageName());
            listSoalan[i] = getString(id);
        }

        lvCategory1.setAdapter(new SoalanListviewAdapter(getActivity(), listSoalan));

        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //Save dalam bundle untuk calculation
    }
}
