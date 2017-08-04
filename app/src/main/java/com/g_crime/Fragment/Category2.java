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

public class Category2 extends Fragment {

    private String[] listSoalan2_1 = new String[3];
    private String[] listSoalan2_2 = new String[2];
    private String[] listSoalan2_3 = new String[1];
    private String[] listSoalan2_4 = new String[2];
    private String[] listSoalan2_5 = new String[3];
    private String[] listSoalan2_6 = new String[2];
    private String[] listSoalan2_7 = new String[1];
    private String[] listSoalan2_8 = new String[2];
    private String[] listSoalan2_9 = new String[2];

    private int[] listNoSoalan2_1 = new int[3];
    private int[] listNoSoalan2_2 = new int[2];
    private int[] listNoSoalan2_3 = new int[1];
    private int[] listNoSoalan2_4 = new int[2];
    private int[] listNoSoalan2_5 = new int[3];
    private int[] listNoSoalan2_6 = new int[2];
    private int[] listNoSoalan2_7 = new int[1];
    private int[] listNoSoalan2_8 = new int[2];
    private int[] listNoSoalan2_9 = new int[2];

    private RecyclerView rcSoalan2_1, rcSoalan2_2, rcSoalan2_3, rcSoalan2_4, rcSoalan2_5, rcSoalan2_6,
            rcSoalan2_7, rcSoalan2_8, rcSoalan2_9;

    public Category2() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category2, container, false);

        rcSoalan2_1 = (RecyclerView) v.findViewById(R.id.rcSoalan2_1);
        rcSoalan2_2 = (RecyclerView) v.findViewById(R.id.rcSoalan2_2);
        rcSoalan2_3 = (RecyclerView) v.findViewById(R.id.rcSoalan2_3);
        rcSoalan2_4 = (RecyclerView) v.findViewById(R.id.rcSoalan2_4);
        rcSoalan2_5 = (RecyclerView) v.findViewById(R.id.rcSoalan2_5);
        rcSoalan2_6 = (RecyclerView) v.findViewById(R.id.rcSoalan2_6);
        rcSoalan2_7 = (RecyclerView) v.findViewById(R.id.rcSoalan2_7);
        rcSoalan2_8 = (RecyclerView) v.findViewById(R.id.rcSoalan2_8);
        rcSoalan2_9 = (RecyclerView) v.findViewById(R.id.rcSoalan2_9);

        //Setup no soalan
        listNoSoalan2_1[0] = 20;
        listNoSoalan2_1[1] = 21;
        listNoSoalan2_1[2] = 22;
        listNoSoalan2_2[0] = 23;
        listNoSoalan2_2[1] = 24;
        listNoSoalan2_3[0] = 25;
        listNoSoalan2_4[0] = 26;
        listNoSoalan2_4[1] = 27;
        listNoSoalan2_5[0] = 28;
        listNoSoalan2_5[1] = 29;
        listNoSoalan2_5[2] = 30;
        listNoSoalan2_6[0] = 31;
        listNoSoalan2_6[1] = 32;
        listNoSoalan2_7[0] = 33;
        listNoSoalan2_8[0] = 34;
        listNoSoalan2_8[1] = 35;
        listNoSoalan2_9[0] = 36;
        listNoSoalan2_9[1] = 37;


        //Setup soalan
        listSoalan2_1[0] = getString(R.string.cS20);
        listSoalan2_1[1] = getString(R.string.cS21);
        listSoalan2_1[2] = getString(R.string.cS22);
        listSoalan2_2[0] = getString(R.string.cS23);
        listSoalan2_2[1] = getString(R.string.cS24);
        listSoalan2_3[0] = getString(R.string.cS25);
        listSoalan2_4[0] = getString(R.string.cS26);
        listSoalan2_4[1] = getString(R.string.cS27);
        listSoalan2_5[0] = getString(R.string.cS28);
        listSoalan2_5[1] = getString(R.string.cS29);
        listSoalan2_5[2] = getString(R.string.cS30);
        listSoalan2_6[0] = getString(R.string.cS31);
        listSoalan2_6[1] = getString(R.string.cS32);
        listSoalan2_7[0] = getString(R.string.cS33);
        listSoalan2_8[0] = getString(R.string.cS34);
        listSoalan2_8[1] = getString(R.string.cS35);
        listSoalan2_9[0] = getString(R.string.cS36);
        listSoalan2_9[1] = getString(R.string.cS37);

        //Setup recyclelist
        rcSoalan2_1.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_1.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_2.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_2.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_3.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_3.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_4.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_4.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_5.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_5.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_6.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_6.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_7.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_7.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_8.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_8.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_9.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_9.setItemAnimator(new DefaultItemAnimator());

        rcSoalan2_1.setAdapter(new SoalanAdapter(listNoSoalan2_1, listSoalan2_1));
        rcSoalan2_2.setAdapter(new SoalanAdapter(listNoSoalan2_2, listSoalan2_2));
        rcSoalan2_3.setAdapter(new SoalanAdapter(listNoSoalan2_3, listSoalan2_3));
        rcSoalan2_4.setAdapter(new SoalanAdapter(listNoSoalan2_4, listSoalan2_4));
        rcSoalan2_5.setAdapter(new SoalanAdapter(listNoSoalan2_5, listSoalan2_5));
        rcSoalan2_6.setAdapter(new SoalanAdapter(listNoSoalan2_6, listSoalan2_6));
        rcSoalan2_7.setAdapter(new SoalanAdapter(listNoSoalan2_7, listSoalan2_7));
        rcSoalan2_8.setAdapter(new SoalanAdapter(listNoSoalan2_8, listSoalan2_8));
        rcSoalan2_9.setAdapter(new SoalanAdapter(listNoSoalan2_9, listSoalan2_9));

        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //Save dalam bundle untuk calculation
    }
}
