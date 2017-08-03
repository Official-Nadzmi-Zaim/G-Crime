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

public class Category2 extends Fragment {


    @SuppressLint("StaticFieldLeak")
    public static ListView lvCategory2_1, lvCategory2_2, lvCategory2_3, lvCategory2_4, lvCategory2_5,
            lvCategory2_6, lvCategory2_7, lvCategory2_8, lvCategory2_9;

    public Category2() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category2, container, false);

        lvCategory2_1 = (ListView)v.findViewById(R.id.lvCategory2_1);
        lvCategory2_2 = (ListView)v.findViewById(R.id.lvCategory2_2);
        lvCategory2_3 = (ListView)v.findViewById(R.id.lvCategory2_3);
        lvCategory2_4 = (ListView)v.findViewById(R.id.lvCategory2_4);
        lvCategory2_5 = (ListView)v.findViewById(R.id.lvCategory2_5);
        lvCategory2_6 = (ListView)v.findViewById(R.id.lvCategory2_6);
        lvCategory2_7 = (ListView)v.findViewById(R.id.lvCategory2_7);
        lvCategory2_8 = (ListView)v.findViewById(R.id.lvCategory2_8);
        lvCategory2_9 = (ListView)v.findViewById(R.id.lvCategory2_9);

        String[] listSoalan1 = new String[3];
        String[] listSoalan2 = new String[2];
        String[] listSoalan3 = new String[1];
        String[] listSoalan4 = new String[2];
        String[] listSoalan5 = new String[3];
        String[] listSoalan6 = new String[2];
        String[] listSoalan7 = new String[1];
        String[] listSoalan8 = new String[2];
        String[] listSoalan9 = new String[2];

        //masukkan soalan ke dalam listSoalan
        listSoalan1[0] = getString(R.string.cS20);
        listSoalan1[1] = getString(R.string.cS21);
        listSoalan1[2] = getString(R.string.cS22);
        listSoalan2[0] = getString(R.string.cS23);
        listSoalan2[1] = getString(R.string.cS24);
        listSoalan3[0] = getString(R.string.cS25);
        listSoalan4[0] = getString(R.string.cS26);
        listSoalan4[1] = getString(R.string.cS27);
        listSoalan5[0] = getString(R.string.cS28);
        listSoalan5[1] = getString(R.string.cS29);
        listSoalan5[2] = getString(R.string.cS30);
        listSoalan6[0] = getString(R.string.cS31);
        listSoalan6[1] = getString(R.string.cS32);
        listSoalan7[0] = getString(R.string.cS33);
        listSoalan8[0] = getString(R.string.cS34);
        listSoalan8[1] = getString(R.string.cS35);
        listSoalan9[0] = getString(R.string.cS36);
        listSoalan9[1] = getString(R.string.cS37);

        lvCategory2_1.setAdapter(new SoalanListviewAdapter(getActivity(), listSoalan1));
        lvCategory2_2.setAdapter(new SoalanListviewAdapter(getActivity(), listSoalan2));
        lvCategory2_3.setAdapter(new SoalanListviewAdapter(getActivity(), listSoalan3));
        lvCategory2_4.setAdapter(new SoalanListviewAdapter(getActivity(), listSoalan4));
        lvCategory2_5.setAdapter(new SoalanListviewAdapter(getActivity(), listSoalan5));
        lvCategory2_6.setAdapter(new SoalanListviewAdapter(getActivity(), listSoalan6));
        lvCategory2_7.setAdapter(new SoalanListviewAdapter(getActivity(), listSoalan7));
        lvCategory2_8.setAdapter(new SoalanListviewAdapter(getActivity(), listSoalan8));
        lvCategory2_9.setAdapter(new SoalanListviewAdapter(getActivity(), listSoalan9));

        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //Save dalam bundle untuk calculation
    }
}
